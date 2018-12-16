package com.epam.triangle.calculation;

import com.epam.triangle.figure.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleCheckerTest {

    @Test (dataProvider = "triangleParams", dataProviderClass = CalculationDataProvider.class)
    public void testIsTriangle(Triangle triangle, boolean expected) {
    TriangleChecker triangleChecker=new TriangleChecker(triangle);

    Assert.assertEquals(triangleChecker.isTriangle(), expected);
    }

    @Test (dataProvider = "isoscelesParams",dataProviderClass = CalculationDataProvider.class)
    public void testIsIsosceles(Triangle triangle, boolean expected) {
        TriangleChecker triangleChecker=new TriangleChecker(triangle);

        Assert.assertEquals(triangleChecker.isIsosceles(),expected);
    }

    @Test (dataProvider = "equiandularParams", dataProviderClass = CalculationDataProvider.class)
    public void testIsEquiangular(Triangle triangle, boolean expected) {
        TriangleChecker triangleChecker=new TriangleChecker(triangle);

        Assert.assertEquals(triangleChecker.isEquiangular(),expected);
    }

}