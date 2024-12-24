package packageShape;

import java.util.List;

public class shapeTest
{
    public void drawShape(List<? extends shape> lists)
    {
        for(shape s:lists)
        {
            s.draw();
        }
    }
}
    
