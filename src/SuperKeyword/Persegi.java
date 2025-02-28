package SuperKeyword;

import inheritance.Kampus;

public class Persegi extends Kubus {

    int getPersegiCorners(){
        return 4;
    }

    int getKubusCorner(){
        return super.getCorners();//kata kunci super digunakan untuk mengakses fiedl,class,atau function yang ada di class parent
    }

}
