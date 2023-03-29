package He_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
         return getWidth() ;

    }

    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }


    @Override
    public void setWidth(double width) {

        setWidth(width);
    }

    @Override
    public void setLength(double length) {
        setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side =" +  getSize()+ ", which is a subclass of " + super.toString();
    }
}

