/**
 */
package eclipseview.polarsys.ui.components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipseview.polarsys.ui.components.GraphComponent#getLabel <em>Label</em>}</li>
 *   <li>{@link eclipseview.polarsys.ui.components.GraphComponent#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getGraphComponent()
 * @model abstract="true"
 * @generated
 */
public interface GraphComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getGraphComponent_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link eclipseview.polarsys.ui.components.GraphComponent#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link eclipseview.polarsys.ui.components.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see eclipseview.polarsys.ui.components.Color
	 * @see #setColor(Color)
	 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getGraphComponent_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link eclipseview.polarsys.ui.components.GraphComponent#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see eclipseview.polarsys.ui.components.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // GraphComponent
