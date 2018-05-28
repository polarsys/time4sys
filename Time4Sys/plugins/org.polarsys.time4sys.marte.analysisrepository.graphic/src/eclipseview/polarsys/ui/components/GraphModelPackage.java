/**
 */
package eclipseview.polarsys.ui.components;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eclipseview.polarsys.ui.components.GraphModelFactory
 * @model kind="package"
 * @generated
 */
public interface GraphModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.polarsys.time4sys.marte.analysisrepository.ui.graphmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphModelPackage eINSTANCE = eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link eclipseview.polarsys.ui.components.impl.GraphModelImpl <em>Graph Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipseview.polarsys.ui.components.impl.GraphModelImpl
	 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getGraphModel()
	 * @generated
	 */
	int GRAPH_MODEL = 0;

	/**
	 * The feature id for the '<em><b>All Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__ALL_NODES = 0;

	/**
	 * The feature id for the '<em><b>All Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__ALL_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipseview.polarsys.ui.components.impl.GraphComponentImpl <em>Graph Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipseview.polarsys.ui.components.impl.GraphComponentImpl
	 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getGraphComponent()
	 * @generated
	 */
	int GRAPH_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_COMPONENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_COMPONENT__COLOR = 1;

	/**
	 * The number of structural features of the '<em>Graph Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclipseview.polarsys.ui.components.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipseview.polarsys.ui.components.impl.NodeImpl
	 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = GRAPH_COMPONENT__LABEL;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COLOR = GRAPH_COMPONENT__COLOR;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TEXT_COLOR = GRAPH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REF_ID = GRAPH_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = GRAPH_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = GRAPH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eclipseview.polarsys.ui.components.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipseview.polarsys.ui.components.impl.ConnectionImpl
	 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LABEL = GRAPH_COMPONENT__LABEL;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__COLOR = GRAPH_COMPONENT__COLOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = GRAPH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = GRAPH_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = GRAPH_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = GRAPH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eclipseview.polarsys.ui.components.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclipseview.polarsys.ui.components.Color
	 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 4;


	/**
	 * Returns the meta object for class '{@link eclipseview.polarsys.ui.components.GraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Model</em>'.
	 * @see eclipseview.polarsys.ui.components.GraphModel
	 * @generated
	 */
	EClass getGraphModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipseview.polarsys.ui.components.GraphModel#getAllNodes <em>All Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Nodes</em>'.
	 * @see eclipseview.polarsys.ui.components.GraphModel#getAllNodes()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_AllNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link eclipseview.polarsys.ui.components.GraphModel#getAllConnections <em>All Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Connections</em>'.
	 * @see eclipseview.polarsys.ui.components.GraphModel#getAllConnections()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_AllConnections();

	/**
	 * Returns the meta object for the attribute '{@link eclipseview.polarsys.ui.components.GraphModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eclipseview.polarsys.ui.components.GraphModel#getName()
	 * @see #getGraphModel()
	 * @generated
	 */
	EAttribute getGraphModel_Name();

	/**
	 * Returns the meta object for class '{@link eclipseview.polarsys.ui.components.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see eclipseview.polarsys.ui.components.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link eclipseview.polarsys.ui.components.Node#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see eclipseview.polarsys.ui.components.Node#getTextColor()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link eclipseview.polarsys.ui.components.Node#getRefId <em>Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see eclipseview.polarsys.ui.components.Node#getRefId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_RefId();

	/**
	 * Returns the meta object for class '{@link eclipseview.polarsys.ui.components.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see eclipseview.polarsys.ui.components.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link eclipseview.polarsys.ui.components.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eclipseview.polarsys.ui.components.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link eclipseview.polarsys.ui.components.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eclipseview.polarsys.ui.components.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link eclipseview.polarsys.ui.components.GraphComponent <em>Graph Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Component</em>'.
	 * @see eclipseview.polarsys.ui.components.GraphComponent
	 * @generated
	 */
	EClass getGraphComponent();

	/**
	 * Returns the meta object for the attribute '{@link eclipseview.polarsys.ui.components.GraphComponent#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see eclipseview.polarsys.ui.components.GraphComponent#getLabel()
	 * @see #getGraphComponent()
	 * @generated
	 */
	EAttribute getGraphComponent_Label();

	/**
	 * Returns the meta object for the attribute '{@link eclipseview.polarsys.ui.components.GraphComponent#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see eclipseview.polarsys.ui.components.GraphComponent#getColor()
	 * @see #getGraphComponent()
	 * @generated
	 */
	EAttribute getGraphComponent_Color();

	/**
	 * Returns the meta object for enum '{@link eclipseview.polarsys.ui.components.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see eclipseview.polarsys.ui.components.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphModelFactory getGraphModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eclipseview.polarsys.ui.components.impl.GraphModelImpl <em>Graph Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipseview.polarsys.ui.components.impl.GraphModelImpl
		 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getGraphModel()
		 * @generated
		 */
		EClass GRAPH_MODEL = eINSTANCE.getGraphModel();

		/**
		 * The meta object literal for the '<em><b>All Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__ALL_NODES = eINSTANCE.getGraphModel_AllNodes();

		/**
		 * The meta object literal for the '<em><b>All Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__ALL_CONNECTIONS = eINSTANCE.getGraphModel_AllConnections();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_MODEL__NAME = eINSTANCE.getGraphModel_Name();

		/**
		 * The meta object literal for the '{@link eclipseview.polarsys.ui.components.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipseview.polarsys.ui.components.impl.NodeImpl
		 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TEXT_COLOR = eINSTANCE.getNode_TextColor();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__REF_ID = eINSTANCE.getNode_RefId();

		/**
		 * The meta object literal for the '{@link eclipseview.polarsys.ui.components.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipseview.polarsys.ui.components.impl.ConnectionImpl
		 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link eclipseview.polarsys.ui.components.impl.GraphComponentImpl <em>Graph Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipseview.polarsys.ui.components.impl.GraphComponentImpl
		 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getGraphComponent()
		 * @generated
		 */
		EClass GRAPH_COMPONENT = eINSTANCE.getGraphComponent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_COMPONENT__LABEL = eINSTANCE.getGraphComponent_Label();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_COMPONENT__COLOR = eINSTANCE.getGraphComponent_Color();

		/**
		 * The meta object literal for the '{@link eclipseview.polarsys.ui.components.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclipseview.polarsys.ui.components.Color
		 * @see eclipseview.polarsys.ui.components.impl.GraphModelPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //GraphModelPackage
