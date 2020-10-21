public class CustomClassLoader extends ClassLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomClassLoader.class);

    @Override
    protected Class<?> findClass(String className) {
        byte[] bytes = readClassFile("/classfile", "/Hello.txt"); // resource/classfile/Hello.txt
        return defineClass(className, bytes, 0, bytes.length);
    }

    public byte[] readClassFile(String subdirectory, String resourceName) {
        String resourcePath = subdirectory + resourceName;
        byte[] bytes = null;
        try (InputStream is = this.getClass().getResourceAsStream(resourcePath)) {
            int available = is.available();
            bytes = new byte[available];
            is.read(bytes);
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (255 - bytes[i]);
            }
        } catch (IOException e) {
            LOGGER.error("File read failed!");
        }
        return bytes;
    }

    public static void main(String[] args)
        throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        Class<?> xlass = customClassLoader.findClass("Hello");
        Method method = xlass.getMethod("hello");
        LOGGER.info("----------");
        method.invoke(xlass.newInstance());
        LOGGER.info("----------");
    }
}