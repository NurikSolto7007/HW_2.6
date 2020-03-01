public class Cars <C extends String, A extends Number, B extends Number> implements Printable {
A model;
B year;
C models;

    public Cars( C models, A model, B year) {
        this.model = model;
        this.year = year;
        this.models = models;
    }

    public A getModel() {
        return model;
    }

    public B getYear() {
        return year;
    }

    public C getModels() {
        return models;
    }

    @Override
    public void print() {
        System.out.println("Модель машины: " + getModels() + " " + "-" + getModel() + " Год выпуска" + getYear());
    }
}

