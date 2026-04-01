package org.talend.repository.example.viewer.label.example;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.talend.repository.example.viewer.content.example.JobOnlyWithAnAContentProvider;
import org.talend.repository.viewer.label.AbstractRepoViewLabelProvider;

public class JobOnlyWithAnALabelProvider extends AbstractRepoViewLabelProvider {

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.viewer.label.RepositoryViewLabelProvider#getText(java.lang.Object)
     */
    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.viewer.label.RepositoryViewLabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(Object element) {
        if (element == JobOnlyWithAnAContentProvider.ROOT) {
            return element.toString();
        }
        return super.getText(element);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.viewer.label.RepositoryViewLabelProvider#getImage(java.lang.Object)
     */
    @Override
    public Image getImage(Object element) {
        if (element == JobOnlyWithAnAContentProvider.ROOT) {
            return null;
        }
        return super.getImage(element);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.viewer.label.RepositoryViewLabelProvider#getFont(java.lang.Object)
     */
    @Override
    public Font getFont(Object element) {
        if (element == JobOnlyWithAnAContentProvider.ROOT) {
            return null;
        }
        return super.getFont(element);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.viewer.label.RepositoryViewLabelProvider#getBackground(java.lang.Object)
     */
    @Override
    public Color getBackground(Object element) {
        if (element == JobOnlyWithAnAContentProvider.ROOT) {
            return null;
        }
        return super.getBackground(element);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.viewer.label.RepositoryViewLabelProvider#getForeground(java.lang.Object)
     */
    @Override
    public Color getForeground(Object element) {
        if (element == JobOnlyWithAnAContentProvider.ROOT) {
            return null;
        }
        return super.getForeground(element);
    }
}
