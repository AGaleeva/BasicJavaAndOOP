package lesson30.homeWork.cars.dao;

import lesson30.homeWork.cars.model.Car;

public class GarageImpl implements Garage {
    private Car[] cars;
    private int size;

   public GarageImpl(int capacity) {
       cars = new Car[capacity];
   }

    @Override
    public boolean addCar(Car car) {
        if (car == null || cars.length == size || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
//        cars[size] = car;
//        size++;
        cars[size++] = car;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) { // regNumbrer.equals(cars[i].getRegNumber())
                Car removed = cars[i];
                cars[i] = cars[size - 1];
                cars[size - 1] = null;
                size--;
                return removed;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (model.equals(cars[i].getModel())) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (model.equals(cars[i].getModel())) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

    @Override
    public Car[] findCarsByBrand(String brand) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (brand.equals(cars[i].getBrand())) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (brand.equals(cars[i].getBrand())) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

    @Override
    public Car[] findCarsByEngine(double minEngine, double maxEngine) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getEngine() >= minEngine && cars[i].getEngine() < maxEngine) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (cars[i].getEngine() >= minEngine && cars[i].getEngine() < maxEngine) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

    @Override
    public Car[] findCarsByColor(String color) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (color.equals(cars[i].getColor())) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (color.equals(cars[i].getColor())) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

}
