package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        //nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {4, 3, 2, 1});

        // nf.find(new int[] {}); // fails, returns MAX_INT MIN_INT or previous call result (here 4,1)
        // nf.find(null); // NULLPE
        // nf.find(new int[] {10}); // fails, again result depends if any prev invocation. If after nf = new NumFinder(); ok

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());


    }
}
