public class Auto {
         String brand;
        String model;
        String color;
        String productionCountry;
        int productionYear;
        double engineVolume;

        public Auto(String brand, String model, String color, String productionCountry, int productionYear, double engineVolume) {
            this.brand = brand;
            if (this.brand == null||brand.isEmpty()) {
                this.brand = "default";
            }
            this.model = model;
            if (this.model == null||model.isEmpty()) {
                this.model = "default";
            }
            this.color = color;
            this.productionCountry = brand;
            if (this.productionCountry == null||productionCountry.isEmpty()) {
                this.productionCountry = "default";
            }
            if (this.productionYear <=0) {
                this.productionYear = 2020;
            } else this.productionYear = productionYear;
            if (this.engineVolume <= 0) {
                this.engineVolume = 1.5;
            } else this.engineVolume = engineVolume;
        }




        @Override
        public String toString() {
            return "\n Car brand " + brand + "\n model " + model + "\n country " + productionCountry + "\n color " + color + "\n production year "+ productionYear + "\n Enginge Volume " + engineVolume;
        }
    }

