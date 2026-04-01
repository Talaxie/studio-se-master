package org.talend.dq.indicators.graph;

import java.awt.Shape;

import edu.uci.ics.jung.graph.Vertex;
import edu.uci.ics.jung.graph.decorators.AbstractVertexShapeFunction;
import edu.uci.ics.jung.graph.decorators.NumberVertexValue;
import edu.uci.ics.jung.graph.decorators.VertexAspectRatioFunction;
import edu.uci.ics.jung.graph.decorators.VertexSizeFunction;

/**
 * Controls the shape, size, and aspect ratio for each vertex.
 * 
 * @author Joshua O'Madadhain
 */
public final class VertexShapeSizeAspect extends AbstractVertexShapeFunction implements VertexSizeFunction,
        VertexAspectRatioFunction {

    protected boolean stretch = false;

    protected boolean scale = false;

    protected boolean funny_shapes = false;

    protected NumberVertexValue voltages;

    public VertexShapeSizeAspect(NumberVertexValue voltages) {
        this.voltages = voltages;
        setSizeFunction(this);
        setAspectRatioFunction(this);
    }

    public void setStretching(boolean stretch) {
        this.stretch = stretch;
    }

    public void setScaling(boolean scale) {
        this.scale = scale;
    }

    public void useFunnyShapes(boolean use) {
        this.funny_shapes = use;
    }

    public int getSize(Vertex v) {
        if (scale)
            return (int) (voltages.getNumber(v).doubleValue() * 30) + 20;
        else
            return 20;
    }

    public float getAspectRatio(Vertex v) {
        if (stretch)
            return (float) (v.inDegree() + 1) / (v.outDegree() + 1);
        else
            return 1.0f;
    }

    public Shape getShape(Vertex v) {
        if (funny_shapes) {
            if (v.degree() < 5) {
                int sides = Math.max(v.degree(), 3);
                return factory.getRegularPolygon(v, sides);
            } else
                return factory.getRegularStar(v, v.degree());
        } else
            return factory.getEllipse(v);
    }

}