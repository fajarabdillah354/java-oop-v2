package StaticKeyword;

public class StaticInner {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*
    dibawah ini code innernya classnya
     */
    public static class Location{
        private String nameLocation;
        private int rangeLocation;

        public String getNameLocation() {
            return nameLocation;
        }

        public void setNameLocation(String nameLocation) {
            this.nameLocation = nameLocation;
        }

        public int getRangeLocation() {
            return rangeLocation;
        }

        public void setRangeLocation(int rangeLocation) {
            this.rangeLocation = rangeLocation;
        }
    }



}
