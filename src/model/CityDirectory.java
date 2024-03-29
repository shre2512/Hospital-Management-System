/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class CityDirectory {
    
    private ArrayList<City> cityDirectory;
    
    public CityDirectory()
    {
        this.cityDirectory = new ArrayList<>();
    }

    public ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(ArrayList<City> cityDirectory) {
        this.cityDirectory = cityDirectory;
    }
    
    public City addNewCity()
    {
        City newCity = new City();
        cityDirectory.add(newCity);
        return newCity;
    }
}
