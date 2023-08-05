package htmlprocessing;

public class tester {
    public static void main(String[] args) {
        String original = "Cap and gowns will be <i> distributed</i> by unit <i>principals</i> in the <b>auditorium<u> at Commencement</u>practice</b>.";
        System.out.println("This is the original:\n" + original);
        String firstTag = methods.findFirstTag(original);
        System.out.println("This is the first tag:\n" + firstTag);
        String removed = methods.remove(firstTag, original);
        System.out.println("This is the original with the first tag removed:\n" + removed);
        String plainText = methods.removeAllTags(original);
        System.out.println("This is the original with all tags removed:\n" + plainText);
        String error="The <i> quick brown fox jumps</u> </i> over the lazy dog";
        plainText = methods.removeAllTags(error);
        System.out.println("This is the original with all tags removed:\n" + plainText);

    }
}
