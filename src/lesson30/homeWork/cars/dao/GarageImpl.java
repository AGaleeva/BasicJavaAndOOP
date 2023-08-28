package lesson30.homeWork.cars.dao;

import lesson28.company.employeeModel.Cars;
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
        cars[size] = car;
        size++;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
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
            if (cars[i].getRegNumber() == regNumber) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getModel().equals(model)) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (cars[i].getModel().equals(model)) {
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
            if (cars[i].getBrand().equals(brand)) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (cars[i].getBrand().equals(brand)) {
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
            if (cars[i].getColor().equals(color)) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (cars[i].getColor().equals(color)) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

}
