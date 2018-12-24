package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {4, 3, 2, 1});
        System.out.print("4,3,2,1 output:");
        System.out.print("Largest: ");
        System.out.print(nf.getLargest());
        System.out.print(" smallest: ");
        System.out.print(nf.getSmallest());

        System.out.println();
        NumFinder nf2 = new NumFinder();

        nf2.find(new int[] {0});
        System.out.print("null output:");
        System.out.print("Largest: ");
        System.out.print(nf2.getLargest());
        System.out.print(" smallest: ");
        System.out.print(nf2.getSmallest());
    }
}
