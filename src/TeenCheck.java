public class TeenCheck {

    public static boolean hasTeen(int x, int y, int z){
        if(x >= 13 && x <=19){
            return true;
        }
        else if(y >= 13 && y <=19){
            return true;
        }
        else if(z >= 13 && z <=19) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int x){
        if(x >= 13 && x <= 19){
            return true;
        }
        return false;
    }
}
