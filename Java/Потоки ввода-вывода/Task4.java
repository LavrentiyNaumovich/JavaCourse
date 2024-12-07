class File implements AutoCloseable {
    public File() {
        System.out.println("File opened");
    }

    @Override
    public void close() {
        System.out.println("File closed");
    }

    public void read() throws Exception {
        System.out.println("Reading data from file");
        if (Math.random() > 0.5)  {
            throw new Exception("Error reading data");
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        try (File file = new File()) {
            file.read();
        }catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
