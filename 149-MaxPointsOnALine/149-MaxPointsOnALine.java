// Last updated: 7/17/2026, 3:08:44 PM
class Solution {
    public int maxPoints(int[][] points) {
        if(points == null || points.length == 0 || points[0].length == 0) return 0;
        
        int res = 1;
        int n = points.length;
        
        // For this problem, we can iterate each one of the points, we scan the rest points, and find 
		// the number of points in the same line with that point
        for(int i = 0; i < n - 1; i++) {
            // because there can be unlimited lines starting from a single point we need a map to keep 
			// track of the number points in different lines
            Map<String, Integer> slopeCountMap = new HashMap<>(); // <slope, count>
            // we are not using double to represent slope, because of the precision issue, and if the 2 
			// points have same x coordinates, then we will be deviding a number by 0 because the 
			// denominator will be 0. 
            
            // Fractions consist of two numbers: a numerator (which is above the line) and a denominator (which is below the line).
            
            // so instead we will use fraction to represent slope, and to help identify the same slope, 
            // we will store fraction in simplest form in the map.
            
            // To find the slope in fraction in simplest form, we need to find the greatest common divisor, 
            // short as gcd. And divide the numberator and denominator by gcd
            
            // we will iterate the points after this point
            for(int j = i + 1; j  < n; j++) {
                String slope = getSlope(points[i], points[j]);
                slopeCountMap.put(slope, slopeCountMap.getOrDefault(slope, 0) + 1);
                res = Math.max(res, slopeCountMap.get(slope) + 1);
            }
        }
		
        return res;
    }
        
    public String getSlope(int[] point1, int[] point2) {
        int dx = point1[0] - point2[0];
        int dy = point1[1] - point2[1];

        // The greatest common divisor (GCD) of two nonzero integers a and b is the greatest positive 
        // integer d such that d is a divisor of both a and b; 
        if(dx == 0 && dy == 0) return "0/0";
        if(dx == 0 && dy != 0) return "1/0";
        if(dx != 0 && dy == 0) return "0/1";

        int gcd = getGCD(dx, dy);
        // we do not need to care abour the sign, because the gcd is already the same sign as 
        // denominator, so the denominator is already positive. So the slope will be the same
        dx /= gcd;
        dy /= gcd;
        
        return dx + "/" + dy;
    }

    public int getGCD(int num1, int num2) {
        if(num2 == 0) return num1;

        return getGCD(num2, num1 % num2);
    }
}