package at.fhhgb.mtd.gop.math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TransformFactoryTest {


        @Test
        void TestTransformfactory() {

            Vector3 vec = new Vector3(new double[] {5.0, 5.0, 1.0});

            Matrix3 translation = TransformFactory.createTranslation(2, 3);
            Matrix3 rotation = TransformFactory.createRotation(Math.PI / 2);
            Matrix3 scale = TransformFactory.createScaling(2,2);
            Matrix3 mirrorHorizontal = TransformFactory.createHorizontalMirroring();
            Matrix3 mirrorVertical = TransformFactory.createVerticalMirroring();



            Vector3 transformedVec = translation.mult(vec);
            Vector3 rotatedVec = rotation.mult(vec);
            Vector3 scaledVec = scale.mult(vec);
            Vector3 mirroredVerticalVec = mirrorVertical.mult(vec);
            Vector3 mirroredHorizontalVec = mirrorHorizontal.mult(vec);


            //verschoben um 2 nach x und 3 nach y
            assertArrayEquals(new double[] {7.0, 8.0, 1.0}, transformedVec.getValues());

            //rotiert um 90 grad
            assertArrayEquals(new double[] {-5.0, 5.0, 1.0}, rotatedVec.getValues());

            //skaliert um das doppelte
            assertArrayEquals(new double[] {10.0, 10.0, 1.0}, scaledVec.getValues());

            //gespiegelt horizontal
            assertArrayEquals(new double[] {5.0, -5.0, 1.0}, mirroredVerticalVec.getValues());

            //gespiegelt vertical
            assertArrayEquals(new double[] {-5.0, 5.0, 1.0}, mirroredHorizontalVec.getValues());

        }

}