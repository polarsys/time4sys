/**
 */
package eclipseview.polarsys.ui.components.impl;

import eclipseview.polarsys.ui.components.Connection;
import eclipseview.polarsys.ui.components.GraphModel;
import eclipseview.polarsys.ui.components.GraphModelPackage;
import eclipseview.polarsys.ui.components.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipseview.polarsys.ui.components.impl.GraphModelImpl#getAllNodes <em>All Nodes</em>}</li>
 *   <li>{@link eclipseview.polarsys.ui.components.impl.GraphModelImpl#getAllConnections <em>All Connections</em>}</li>
 *   <li>{@link eclipseview.polarsys.ui.components.impl.GraphModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphModelImpl extends MinimalEObjectImpl.Container implements GraphModel {
	/**
	 * The cached value of the '{@link #getAllNodes() <em>All Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> allNodes;

	/**
	 * The cached value of the '{@link #getAllConnections() <em>All Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> allConnections;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphModelPackage.Literals.GRAPH_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getAllNodes() {
		if (allNodes == null) {
			allNodes = new EObjectContainmentEList<Node>(Node.class, this, GraphModelPackage.GRAPH_MODEL__ALL_NODES);
		}
		return allNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getAllConnections() {
		if (allConnections == null) {
			allConnections = new EObjectContainmentEList<Connection>(Connection.class, this, GraphModelPackage.GRAPH_MODEL__ALL_CONNECTIONS);
		}
		return allConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphModelPackage.GRAPH_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphModelPackage.GRAPH_MODEL__ALL_NODES:
				return ((InternalEList<?>)getAllNodes()).basicRemove(otherEnd, msgs);
			case GraphModelPackage.GRAPH_MODEL__ALL_CONNECTIONS:
				return ((InternalEList<?>)getAllConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphModelPackage.GRAPH_MODEL__ALL_NODES:
				return getAllNodes();
			case GraphModelPackage.GRAPH_MODEL__ALL_CONNECTIONS:
				return getAllConnections();
			case GraphModelPackage.GRAPH_MODEL__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphModelPackage.GRAPH_MODEL__ALL_NODES:
				getAllNodes().clear();
				getAllNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphModelPackage.GRAPH_MODEL__ALL_CONNECTIONS:
				getAllConnections().clear();
				getAllConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case GraphModelPackage.GRAPH_MODEL__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphModelPackage.GRAPH_MODEL__ALL_NODES:
				getAllNodes().clear();
				return;
			case GraphModelPackage.GRAPH_MODEL__ALL_CONNECTIONS:
				getAllConnections().clear();
				return;
			case GraphModelPackage.GRAPH_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphModelPackage.GRAPH_MODEL__ALL_NODES:
				return allNodes != null && !allNodes.isEmpty();
			case GraphModelPackage.GRAPH_MODEL__ALL_CONNECTIONS:
				return allConnections != null && !allConnections.isEmpty();
			case GraphModelPackage.GRAPH_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GraphModelImpl
