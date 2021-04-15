package leetcode;

public class S20_ValidParentheses {
    public boolean isValid(String s) {
        String[] sSplit = s.split("");
        String[] before = new String[s.length()];
        int beforeIndex = 0;
        boolean isValid = false;
        if (s.length()==1){
            return false;
        }
        for (int i = 0; i < sSplit.length ; i++){
            if (sSplit[i].equals("[")){
                before[beforeIndex]="[";
                beforeIndex++;
            }else if (sSplit[i].equals("{")){
                before[beforeIndex]="{";
                beforeIndex++;
            }else if (sSplit[i].equals("(")){
                before[beforeIndex]="(";
                beforeIndex++;
            }else {
                if (beforeIndex==0){
                    return false;
                }
                beforeIndex--;
                if (sSplit[i].equals("]")){
                    if (!before[beforeIndex].equals("[")){
                        return false;
                    }
                }else if (sSplit[i].equals("}")){
                    if (!before[beforeIndex].equals("{")){
                        return false;
                    }
                }else if (sSplit[i].equals(")")){
                    if (!before[beforeIndex].equals("(")){
                        return false;
                    }
                }
                isValid = true;
            }

        }
        return isValid;
    }

}
