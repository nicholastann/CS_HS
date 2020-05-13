public class TextTester {
    public static void main(String[] args) {
        /**
         * CHANGE EVERY "Tann_Text" TO YOUR FILE NAME
         * THEN, RUN THE PROGRAM AND CHECK THE ANSWERS!
         */
        System.out.println("TEXT TESTER!");
        Tann_Text t1 = new Tann_Text("Computer Science AP".toCharArray());
        Tann_Text t2 = new Tann_Text("The exam is on May 2nd".toCharArray());
        Tann_Text t3 = new Tann_Text("Be ready to study".toCharArray());

        System.out.println("\n   LENGTH TESTS");
        System.out.println("T1 Length should be 19, your answer: "+t1.myLength());
        System.out.println("T2 Length should be 22, your answer: "+t2.myLength());
        System.out.println("T3 Length should be 17, your answer: "+t3.myLength());

        System.out.println("\n   VOWEL COUNT TESTS");
        System.out.println("T1 Vowel Count should be 7, your answer: "+t1.myVowelCount());
        System.out.println("T2 Vowel Count should be 6, your answer: "+t2.myVowelCount());
        System.out.println("T3 Vowel Count should be 5, your answer: "+t3.myVowelCount());

        System.out.println("\n   CHAR AT INDEX 5 TESTS");
        System.out.println("T1 Char At 5 should be t, your answer: "+t1.myCharAt(5));
        System.out.println("T2 Char At 5 should be x, your answer: "+t2.myCharAt(5));
        System.out.println("T3 Char At 5 should be a, your answer: "+t3.myCharAt(5));

        System.out.println("\n   FIRST INDEX OF 'r' TESTS");
        System.out.println("T1 First 'r' should be  7, your answer: "+t1.myFirstIndexOf('r'));
        System.out.println("T2 First 'r' should be -1, your answer: "+t2.myFirstIndexOf('r'));
        System.out.println("T3 First 'r' should be  3, your answer: "+t3.myFirstIndexOf('r'));

        System.out.println("\n   LAST INDEX OF 't' TESTS");
        System.out.println("T1 Last 't' should be  5, your answer: "+t1.myLastIndexOf('t'));
        System.out.println("T2 Last 't' should be -1, your answer: "+t2.myLastIndexOf('t'));
        System.out.println("T3 Last 't' should be 13, your answer: "+t3.myLastIndexOf('t'));

        System.out.println("\n   EQUALS {Be sure to study} TESTS");
        char[] a = {'B','e',' ','r','e','a','d','y',' ','t','o',' ','s','t','u','d','y'};
        System.out.println("T1 Equals {Be sure to study} should be false, your answer: "+t1.myEquals(a));
        System.out.println("T2 Equals {Be sure to study} should be false, your answer: "+t2.myEquals(a));
        System.out.println("T3 Equals {Be sure to study} should be true,  your answer: "+t3.myEquals(a));

        System.out.println("\n   STARTS WITH TESTS");
        System.out.println("T1 Starts with {Hi} should be false, your answer: "+t1.myStartsWith(new char[]{'H','i'}));
        System.out.println("T2 Starts with {The} should be true, your answer: "+t2.myStartsWith(new char[]{'T','h','e'}));
        System.out.println("T3 Starts with {Be} should be true, your answer: "+t3.myStartsWith(new char[]{'B','e'}));

        System.out.println("\n   ENDS WITH TESTS");
        System.out.println("T1 Starts with {AP} should be true, your answer: "+t1.myEndsWith(new char[]{'A','P'}));
        System.out.println("T2 Starts with {2nd} should be true, your answer: "+t2.myEndsWith(new char[]{'2','n','d'}));
        System.out.println("T3 Starts with {LOL} should be false, your answer: "+t3.myEndsWith(new char[]{'L','O','L'}));

        System.out.print("\n   ADD {HELLO } TO START TESTS");
        char[] b = {'H','E','L','L','O',' '};
        t1.myAddToStart(b); System.out.print("\nT1 should start with HELLO: "); t1.myPrint();
        t2.myAddToStart(b); System.out.print("\nT1 should start with HELLO: "); t2.myPrint();
        t3.myAddToStart(b); System.out.print("\nT1 should start with HELLO: "); t3.myPrint();

        System.out.println("\n\n   ADD { GOODBYE} TO END TESTS");
        char[] c = {' ','G','O','O','D','B','Y','E'};
        t1.myAddToEnd(c); System.out.print("T1 should end with GOODBYE: "); t1.myPrint();
        t2.myAddToEnd(c); System.out.print("\nT2 should end with GOODBYE: "); t2.myPrint();
        t3.myAddToEnd(c); System.out.print("\nT3 should end with GOODBYE: "); t3.myPrint();

        System.out.println("\n\n   INSERT {-LOL-} AT INDEX 10 TESTS");
        char[] d = {'-','L','O','L','-'};
        t1.myInsert(d,11); System.out.print("T1 Insert {-LOL-}, your answer: "); t1.myPrint();
        t2.myInsert(d,11); System.out.print("\nT2 Insert {-LOL-}, your answer: "); t2.myPrint();
        t3.myInsert(d,11); System.out.print("\nT3 Insert {-LOL-}, your answer: "); t3.myPrint();

        System.out.println("\n\n   CONTAINS {e-} TESTS");
        char[] e = {'e','-'};
        System.out.println("T1 Contains {e-} should be false, your answer: "+t1.contains(e));
        System.out.println("T2 Contains {e-} should be true, your answer: "+t2.contains(e));
        System.out.println("T3 Contains {e-} should be true, your answer: "+t3.contains(e));

        System.out.println("\n   REPLACE {L} WITH {X} TESTS");
        t1.replace('L','X'); System.out.print("T1 Replace {L} with {X}, your answer: "); t1.myPrint();
        t2.replace('L','X'); System.out.print("\nT2 Replace {L} with {X}, your answer: "); t2.myPrint();
        t3.replace('L','X'); System.out.print("\nT3 Replace {L} with {X}, your answer: "); t3.myPrint();

        System.out.println("\n\n   SUBCHARS FROM 6 TO 11 TESTS");
        System.out.println("T1 Subchars should be Compu, your answer: "+new String(t1.subChars(6,11)));
        System.out.println("T2 Subchars should be The e, your answer: "+new String(t2.subChars(6,11)));
        System.out.println("T3 Subchars should be Be re, your answer: "+new String(t3.subChars(6,11)));

        System.out.println("\n   SPLIT {Did you ever hear the tragedy of Darth Plagueis the wise?} by e");
        System.out.println("THE ANSWER SHOULD BE: ");
        System.out.println("Did you ");
        System.out.println("v");
        System.out.println("r h");
        System.out.println("ar th");
        System.out.println(" trag");
        System.out.println("dy of Darth Plagu");
        System.out.println("is th");
        System.out.println(" wis");
        System.out.println();
        System.out.println("YOUR ANSWER BELOW: ");
        char[] f = "Did you ever hear the tragedy of Darth Plagueis the wise?".toCharArray();
        Tann_Text t4 = new Tann_Text(f);
        char[][] splitAnswer = t4.split('e');
        for(int row=0; row<splitAnswer.length; row++) {
            for(int col=0; col<splitAnswer[row].length; col++) {
                System.out.print(splitAnswer[row][col]);
            }
            System.out.println();
        }
    }
}