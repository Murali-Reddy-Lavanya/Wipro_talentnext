package oops_java;
	import java.util.Scanner;

	// Video class
	class Video {
	    private String videoName;
	    private boolean checkout;
	    private int rating;

	    public Video(String name) {
	        this.videoName = name;
	        this.checkout = false;
	        this.rating = 0;
	    }

	    public String getName() {
	        return videoName;
	    }

	    public void doCheckout() {
	        this.checkout = true;
	    }

	    public void doReturn() {
	        this.checkout = false;
	    }

	    public void receiveRating(int rating) {
	        this.rating = rating;
	    }

	    public int getRating() {
	        return rating;
	    }

	    public boolean getCheckout() {
	        return checkout;
	    }
	}

	// VideoStore class
	class VideoStore {
	    private Video[] store = new Video[10];
	    private int count = 0;

	    public void addVideo(String name) {
	        store[count] = new Video(name);
	        count++;
	        System.out.println("Video \"" + name + "\" added successfully.");
	    }

	    public void doCheckout(String name) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                store[i].doCheckout();
	                System.out.println("Video \"" + name + "\" checked out successfully.");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void doReturn(String name) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                store[i].doReturn();
	                System.out.println("Video \"" + name + "\" returned successfully.");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void receiveRating(String name, int rating) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                store[i].receiveRating(rating);
	                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void listInventory() {
	        System.out.println("--------------------------------------------------------");
	        System.out.printf("%-15s | %-15s | %-6s\n", "Video Name", "Checkout Status", "Rating");
	        for (int i = 0; i < count; i++) {
	            System.out.printf("%-15s | %-15s | %-6d\n", store[i].getName(), store[i].getCheckout(), store[i].getRating());
	        }
	        System.out.println("--------------------------------------------------------");
	    }
	}

	// VideoLauncher class (main)
	public class OOPSminiproject  {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        VideoStore store = new VideoStore();
	        int choice;

	        do {
	            System.out.println("\nMAIN MENU");
	            System.out.println("=========");
	            System.out.println("1. Add Videos:");
	            System.out.println("2. Check Out Video:");
	            System.out.println("3. Return Video:");
	            System.out.println("4. Receive Rating:");
	            System.out.println("5. List Inventory:");
	            System.out.println("6. Exit:");
	            System.out.print("Enter your choice (1..6): ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the name of the video you want to add: ");
	                    String nameToAdd = scanner.nextLine();
	                    store.addVideo(nameToAdd);
	                    break;
	                case 2:
	                    System.out.print("Enter the name of the video you want to check out: ");
	                    String nameToCheckout = scanner.nextLine();
	                    store.doCheckout(nameToCheckout);
	                    break;
	                case 3:
	                    System.out.print("Enter the name of the video you want to return: ");
	                    String nameToReturn = scanner.nextLine();
	                    store.doReturn(nameToReturn);
	                    break;
	                case 4:
	                    System.out.print("Enter the name of the video you want to rate: ");
	                    String nameToRate = scanner.nextLine();
	                    System.out.print("Enter the rating for this video: ");
	                    int rating = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    store.receiveRating(nameToRate, rating);
	                    break;
	                case 5:
	                    store.listInventory();
	                    break;
	                case 6:
	                    System.out.println("Thank you for using Video Rental Inventory System!");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please enter 1..6.");
	            }
	        } while (choice != 6);

	        scanner.close();
	    }
	}

