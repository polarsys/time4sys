/**
 */
package eclipseview.polarsys.ui.components;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipseview.polarsys.ui.components.GraphModel#getAllNodes <em>All Nodes</em>}</li>
 *   <li>{@link eclipseview.polarsys.ui.components.GraphModel#getAllConnections <em>All Connections</em>}</li>
 *   <li>{@link eclipseview.polarsys.ui.components.GraphModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getGraphModel()
 * @model
 * @generated
 */
public interface GraphModel extends EObject {
	/**
	 * Returns the value of the '<em><b>All Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link eclipseview.polarsys.ui.components.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Nodes</em>' containment reference list.
	 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getGraphModel_AllNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getAllNodes();

	/**
	 * Returns the value of the '<em><b>All Connections</b></em>' containment reference list.
	 * The list contents are of type {@link eclipseview.polarsys.ui.components.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Connections</em>' containment reference list.
	 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getGraphModel_AllConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getAllConnections();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eclipseview.polarsys.ui.components.GraphModelPackage#getGraphModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eclipseview.polarsys.ui.components.GraphModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

		
} // GraphModel
