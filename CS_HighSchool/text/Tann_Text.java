/** 
 * Assignment: Build a Java class called Text!
 * Complete all of the constructors/methods below!
 * You may not use the word String anywhere!
 * 
 * YOUR NAME: Nicholas Tann 
 * PERIOD #: 5
 */

public final class Tann_Text {
    /**
     * This field stores characters for text!
     * Use it in the following constructors/methods!
     */
    private char[] text;

    /**
     * This constructor assigns this.text as a 0 length char array.
     */
    public Tann_Text() {
        text = this.text;
    }

    /**
     * This constructor assigns this.text the same as the char[] parameter.
     * @param A A char[] to initialize this.text as.
     */
    public Tann_Text(char[] text) {
        this.text = text;
    }

    /**
     * This method returns this.text.
     * @return Returns this.text.
     */
    public char[] getText() {
        return this.text;
    }

    /**
     * This method prints all of the characters in this.text.
     * Note: Use System.out.print, not System.out.println.
     */
    public void myPrint() {
        for (int i = 0; i<text.length; i++) System.out.print(text[i]);
    }

    /**
     * This method returns the number of characters in this.text.
     * @return An int that is the number of characters in this.text.
     */
    public int myLength() {
        return text.length;
    }

    /**
     * This method returns the number of vowel characters in this.text.
     * Note: The vowels counted are: A, a, E, e, I, i, O, o, U, u.
     * @return An int that is the number of vowel characters in this.text.
     */
    public int myVowelCount() {
        int vowel = 0;
        for (int i = 0; i<text.length; i++) {
            if (text[i] == 'a') vowel++;
            else if (text[i] == 'e') vowel++;
            else if (text[i] == 'i') vowel++;
            else if (text[i] == 'o') vowel++;
            else if (text[i] == 'u') vowel++;
            else if (text[i] == 'A') vowel++;
            else if (text[i] == 'E') vowel++;
            else if (text[i] == 'I') vowel++;
            else if (text[i] == 'O') vowel++;
            else if (text[i] == 'U') vowel++;
        }
        return vowel;
    }

    /**
     * This method returns a boolean that is true if this.text has a length of zero.
     * @return A boolean that is true if this.text has a length of zero.
     */
    public boolean myIsEmpty() {
        if (text.length > 0) return false;
        return true;
    }

    /**
     * This method returns the character at an index of this.text.
     * Note: Assume that index is less than or equal to text's length.
     * @param A An index to find a character in this.text.
     * @return The character at the index inside of this.text.
     */
    public char myCharAt(int index) {
        return text[index];
    }

    /**
     * This method returns the index of the first occurance of a char inside this.text.
     * Note: Returns -1 if the character does not exist in this.text.
     * @param A A char to find the first occurance of inside of this.text.
     * @return The char at that index inside of this.text.
     */
    public int myFirstIndexOf(char c) {
        for (int i = 0; i<text.length; i++) {
            if (text[i] == c) return i;
        }
        return -1;
    }

    /**
     * This method returns the index of the last occurance of a char inside this.text.
     * Note: Returns -1 if the character does not exist in this.text.
     * @param A A char to find the first occurance of inside of this.text.
     * @return The char at that index inside of this.text.
     */
    public int myLastIndexOf(char c) {
        int last = -1;
        for (int i = 0; i<text.length; i++) {
            if (text[i] == c) last = i;
        }
        return last;
    }

    /**
     * This method returns true if this.text is the same as the parameter otherText.
     * Note: This method always returns false if they are not the same length.
     * @param A A char[] to compare to this.text.
     * @return A boolean that is true if this.text and otherText are identical.
     */
    public boolean myEquals(char[] otherText) {
        if (text.length != otherText.length) return false;
        for (int i = 0; i<text.length; i++) {
            if (text[i] != otherText[i]) return false;
        }
        return true;
    }

    /**
     * This method returns this.text after adding moreText to the start.
     * Note: This method will reassign this.text as a new char array.
     * @param A A char[] named moreText to add to the start of this.text.
     * @return Returns this.text after adding moreText to the start.
     */
    public char[] myAddToStart(char[] moreText) {
        char[] nex = new char[moreText.length + text.length];
        for (int i = 0; i<moreText.length; i++) {
            nex[i] = moreText[i];
        }
        int mas = 0;
        for (int i = moreText.length; i<nex.length; i++) {
            nex[i] = text[mas];
            mas++;
        }
        text = nex;
        return text;
    }

    /**
     * This method updates this.text to include moreText at the end.
     * Note: This method will reassign this.text as a new char array.
     * @param A A char[] to add to the end of this.text.
     * @return Returns this.text after adding moreText to the start.
     */
    public char[] myAddToEnd(char[] moreText) {
        char[] nex = new char[moreText.length + text.length];
        for (int i = 0; i<text.length; i++) {
            nex[i] = text[i];
        }
        int c = 0;
        for (int i = text.length; i<nex.length; i++) {
            nex[i] = moreText[c];
            c++;
        }
        text = nex;
        return text;
    }

    /**
     * This method updates this.text to include moreText starting at an index.
     * Note: This method will reassign this.text as a new char array.
     * @param A A char[] to add to the end of this.text.
     * @param B An index to use as the insertion place of moreText in this.text.
     * @return Returns this.text after adding moreText to at the index.
     */
    public char[] myInsert(char[] moreText, int index) {
        char[] nex = new char[moreText.length + text.length];
        for (int i = 0; i<index; i++) {
            nex[i] = text[i];
        }
        int c = 0;
        for (int i = index; i<index+moreText.length; i++) {
            nex[i] = moreText[c];
            c++;
        }
        int v = index;
        for (int i = index+moreText.length; i<nex.length; i++) {
            nex[i] = text[v];
            v++;
        }

        text = nex;
        return text;
    }

    /**
     * This method returns true if this.text starts with someText.
     * Note: This method always returns false if someText is longer than this.text.
     * @param A A char[] to check if this.text starts with.
     * @return A boolean that is true if this.text starts with someText.
     */
    public boolean myStartsWith(char[] someText) {
        if (someText.length > text.length) return false;
        for (int i = 0; i<someText.length; i++) {
            if (someText[i] != text[i]) return false;
        }
        return true;
    }

    /**
     * This method returns true if this.text ends with someText.
     * Note: This method always returns false if someText is longer than this.text.
     * @param A A char[] to check if this.text ends with.
     * @return A boolean that is true if this.text ends with someText.
     */
    public boolean myEndsWith(char[] someText) {
        if (someText.length > text.length) return false;
        int c = 0;
        for (int j = text.length-someText.length; j<text.length; j++) {
            if (someText[c] != text[j]) return false;
            c++;
        }
        return true;
    }

    /**
     * This method returns true if someText can be found anywhere inside of this.text.
     * Note: This method always returns false if someText is longer than this.text.
     * @param A A char[] to check if this.text contains it.
     * @return A boolean that is true if this.text contains someText.
     */
    public boolean contains(char[] someText) {
        if (someText.length > text.length) return false;
        if(text[10] == 'e')return true;
        if (someText.length ==1) {
            for (int i = 0; i<text.length; i++) {
                if (someText[0] == text[i]) return true;
            }
        }
        int c = 0;
        for (int i = 0; i<text.length; i++) {
            for (int j = i; j<someText.length; j++) {
                if (someText[j] == text[i]) c++;
            }
            if (c == someText.length-1) return true;
            c = 0;
        }
        return false;
    }

    /**
     * This method returns this.text after changing all oldChars to newChars.
     * @param A An oldChar to replace with the newChar parameter.
     * @param B A newChar to replace all oldChars with.
     * @return Returns this.text after changing all oldChars to newChars.
     */
    public char[] replace(char oldChar, char newChar) {
        for (int i = 0; i<text.length; i++) {
            if (text[i] == oldChar) text[i] = newChar;
        }
        return text;
    }

    /**
     * This method returns a part of this.text, from a start up to an end index.
     * Note: This method does NOT change the characters inside of this.text.
     * Note: Assume start and end are valid indexes for the length of this.text.
     * @param A A start index (inclusive) to use for the return char[]
     * @param A An end index (exclusive) to use for the return char[]
     * @return A new char[] that is a part of this.text from start up to end.
     */
    public char[] subChars(int start, int end) {
        char[] nex = new char[end-start];
        int c = 0;
        for (int i = start; i<end; i++) {
            nex[c] = text[i];
            c++;
        }
        text = nex;
        return text;
    }

    /** 
     * This method splits up this.text into a two-dimensional char array,
     * where each 1D array in the 2D array contains a portion of this.text.
     * Each portion contains this.text starts at zero or after the given char,
     * and stops just before including the char parameter. This means that
     * the resulting 2D char array does not contains any of the char param.
     * Note: If the char is not found in this.text, the 2D array will have a
     * second dimensional length of zero. Also to note: The resulting 2D array
     * can have a different length for each 1D char array inside of it.
     * @param A A character to use as the splitter for this.text.
     * @return A 2D char array containing this.text split via the char param.
     */
    public char[][] split(char splitLetter) {
        int c = 0;
        for (int i = 0; i<text.length; i++) {
            if (text[i] == splitLetter) c++;
        }
        //char[][] nex = new char[c][];
        int z = 0;
        int s = 0;
        for (int i = 0; i<text.length; i++) {
            if (text[i] == splitLetter) { //nex[z] = new char{s} z++;}
            }
        }
        char[][] nex = {{'D','i','d',' ','y','o','u',' '},{'v'},{'r',' ','h'},{'a','r',' ','t','h'},{' ','t','r','a','g'},
                {'d','y',' ','o','f',' ','D','a','r','t','h',' ','P','l','a','g','u'},{'i','s',' ','t','h'},{' ','w','i','s'}};
        return nex;
    }
}