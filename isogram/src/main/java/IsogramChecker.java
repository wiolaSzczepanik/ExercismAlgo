import java.util.Arrays;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        String lowercase = phrase.toLowerCase();
        char[] letters = lowercase.toCharArray();
        Arrays.sort(letters);

        int size = letters.length;

        for(int i=0; i<size-1; i++){
            if(letters[i]==letters[i+1]){
                if(letters[i]==' ' && letters[i+1] == ' ' ||
                        letters[i]=='-'&& letters[i+1] == '-'){
                    continue;
                }
                return false;
            }
        }
        return true;
    }

}
