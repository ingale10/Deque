package deque;


	public class Main {
		public static void main(String[] args) throws InterruptedException {
			MultiStageProcessing processor = new MultiStageProcessing(3);

			processor.addItem(new Item(1, 0, 1, "Item 1"));
			processor.addItem(new Item(2, 0, 2, "Item 2"));
			processor.addItem(new Item(3, 0, 3, "Item 3"));

			processor.startProcessing();

			Thread.sleep(1000);

			processor.shutdown();
		}
		
	}



