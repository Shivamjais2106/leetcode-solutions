class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin;
        double Fahrenheit;
        Kelvin = celsius + 273.15;
        Fahrenheit = celsius * 1.80 + 32.00;
        double[] ans = new double[2];
        ans[0] = Kelvin;
        ans[1] =  Fahrenheit ;
        return ans;
    }
}