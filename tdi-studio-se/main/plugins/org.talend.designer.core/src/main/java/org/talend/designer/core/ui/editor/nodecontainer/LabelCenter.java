package org.talend.designer.core.ui.editor.nodecontainer;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.TextUtilities;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

public class LabelCenter extends Figure {

    private static String ELLIPSIS = "..."; //$NON-NLS-1$

    private final static int OFFSET = 3;

    private Image img;

    private Dimension size = new Dimension();

    private int alignment;

    private String text = ""; //$NON-NLS-1$

    /**
     * Constructor<br>
     * The default alignment is <code>PositionConstants.CENTER</code>.
     */
    public LabelCenter() {
        this(null, PositionConstants.CENTER);
    }

    /**
     * Constructor<br>
     * The default alignment is <code>PositionConstants.CENTER</code>.
     * 
     * @param image The Image to be displayed
     */
    public LabelCenter(Image image) {
        this(image, PositionConstants.CENTER);
    }

    /**
     * Constructor
     * 
     * @param image The Image to be displayed
     * @param alignment A PositionConstant indicating the alignment
     * 
     * @see ImageFigure#setImage(Image)
     * @see ImageFigure#setAlignment(int)
     */
    public LabelCenter(Image image, int alignment) {
        setImage(image);
        setAlignment(alignment);
    }

    /**
     * @return The Image that this Figure displays
     */
    public Image getImage() {
        return img;
    }

    /**
     * Calculates the necessary size to display the Image within the figure's client area.
     * 
     * @see org.eclipse.draw2d.Figure#getPreferredSize(int, int)
     */
    public Dimension getPreferredSize(int wHint, int hHint) {
        if (getInsets() == NO_INSETS)
            return size;
        Insets i = getInsets();
        return size.getExpanded(i.getWidth(), i.getHeight());
    }

    /**
     * @see org.eclipse.draw2d.Figure#paintFigure(Graphics)
     */
    protected void paintFigure(Graphics graphics) {
        super.paintFigure(graphics);

        if (getImage() == null)
            return;

        int x, y;
        Rectangle area = getClientArea();
        switch (alignment & PositionConstants.NORTH_SOUTH) {
        case PositionConstants.NORTH:
            y = area.y;
            break;
        case PositionConstants.SOUTH:
            y = area.y + area.height - size.height;
            break;
        default:
            y = (area.height - size.height) / 2 + area.y;
            break;
        }
        switch (alignment & PositionConstants.EAST_WEST) {
        case PositionConstants.EAST:
            x = area.x + area.width - size.width;
            break;
        case PositionConstants.WEST:
            x = area.x;
            break;
        default:
            x = (area.width - size.width) / 2 + area.x;
            break;
        }
        graphics.drawImage(getImage(), x, y);

        if (!getText().equals("")) { //$NON-NLS-1$
            // Draw String here
            String displayText = getFinalDisplayText();
            Dimension textSize = calculateTextSize(displayText);
            graphics.drawText(displayText, x + (area.width - textSize.width) / 2, y + (area.height - textSize.height) / 2
                    - OFFSET);
        }
    }

    public String getFinalDisplayText() {
        Dimension textSize = calculateTextSize(getText());
        Rectangle area = getClientArea();
        Insets i = getInsets();
        if (textSize.width >= area.width - i.left - i.right - OFFSET * 2) {
            return ELLIPSIS;
        }
        return text;
    }

    /**
     * Sets the alignment of the Image within this Figure. The alignment comes into play when the ImageFigure is larger
     * than the Image. The alignment could be any valid combination of the following:
     * 
     * <UL>
     * <LI>PositionConstants.NORTH</LI>
     * <LI>PositionConstants.SOUTH</LI>
     * <LI>PositionConstants.EAST</LI>
     * <LI>PositionConstants.WEST</LI>
     * <LI>PositionConstants.CENTER or PositionConstants.NONE</LI>
     * </UL>
     * 
     * @param flag A constant indicating the alignment
     */
    public void setAlignment(int flag) {
        alignment = flag;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets the Image that this ImageFigure displays.
     * <p>
     * IMPORTANT: Note that it is the client's responsibility to dispose the given image.
     * 
     * @param image The Image to be displayed. It can be <code>null</code>.
     */
    public void setImage(Image image) {
        if (img == image)
            return;
        img = image;
        if (img != null)
            size = new Rectangle(image.getBounds()).getSize();
        else
            size = new Dimension();
        revalidate();
        repaint();
    }

    /**
     * Calculates and returns the size of the Label's text. Note that this Dimension is calculated using the Label's
     * full text, regardless of whether or not its text is currently truncated. If text size considering current
     * truncation is desired, use {@link #calculateSubStringTextSize()}.
     * 
     * @return the size of the label's text, ignoring truncation
     * @since 2.0
     */
    protected Dimension calculateTextSize(final String text) {
        return getTextUtilities().getTextExtents(text, getFont());
    }

    /**
     * Gets the <code>TextUtilities</code> instance to be used in measurement calculations.
     * 
     * @return a <code>TextUtilities</code> instance
     * @since 3.4
     */
    public TextUtilities getTextUtilities() {
        return TextUtilities.INSTANCE;
    }
}
