package Lab3;

public class String_Performance_Test {
	 public static void main(String[] args) {
	        int iterations = 10000;

	        // Test with StringBuffer (Thread-Safe)
	        StringBuffer stringBuffer = new StringBuffer();
	        long startBuffer = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append("AIET");
	        }
	        long endBuffer = System.nanoTime();
	        long bufferTime = endBuffer - startBuffer;
	        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");

	        // Test with StringBuilder (Not Thread-Safe but faster)
	        StringBuilder stringBuilder = new StringBuilder();
	        long startBuilder = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append("AIET");
	        }
	        long endBuilder = System.nanoTime();
	        long builderTime = endBuilder - startBuilder;
	        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");

	        // Compare and justify
	        if (builderTime < bufferTime) {
	            System.out.println("\n StringBuilder is faster than StringBuffer in single-threaded context.");
	        } else {
	            System.out.println("\n StringBuffer is slower but safer in multi-threaded applications.");
	        }
	    }
}
