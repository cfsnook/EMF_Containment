/**
 * Copyright (c) 2017 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.emf.containment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.containment.ContainmentFactory
 * @model kind="package"
 * @generated
 */
public interface ContainmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "containment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/containment/2017";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "containment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainmentPackage eINSTANCE = ac.soton.eventb.emf.containment.impl.ContainmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.containment.impl.ContainsExtensionImpl <em>Contains Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.containment.impl.ContainsExtensionImpl
	 * @see ac.soton.eventb.emf.containment.impl.ContainmentPackageImpl#getContainsExtension()
	 * @generated
	 */
	int CONTAINS_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__ANNOTATIONS = CorePackage.ABSTRACT_EXTENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__EXTENSIONS = CorePackage.ABSTRACT_EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__ATTRIBUTES = CorePackage.ABSTRACT_EXTENSION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__REFERENCE = CorePackage.ABSTRACT_EXTENSION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__GENERATED = CorePackage.ABSTRACT_EXTENSION__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__LOCAL_GENERATED = CorePackage.ABSTRACT_EXTENSION__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__INTERNAL_ID = CorePackage.ABSTRACT_EXTENSION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__EXTENSION_ID = CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__EXTENSION = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION__NAMES = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contains Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXTENSION_FEATURE_COUNT = CorePackage.ABSTRACT_EXTENSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.containment.ContainsExtension <em>Contains Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Extension</em>'.
	 * @see ac.soton.eventb.emf.containment.ContainsExtension
	 * @generated
	 */
	EClass getContainsExtension();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.containment.ContainsExtension#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension</em>'.
	 * @see ac.soton.eventb.emf.containment.ContainsExtension#getExtension()
	 * @see #getContainsExtension()
	 * @generated
	 */
	EReference getContainsExtension_Extension();

	/**
	 * Returns the meta object for the attribute list '{@link ac.soton.eventb.emf.containment.ContainsExtension#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Names</em>'.
	 * @see ac.soton.eventb.emf.containment.ContainsExtension#getNames()
	 * @see #getContainsExtension()
	 * @generated
	 */
	EAttribute getContainsExtension_Names();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContainmentFactory getContainmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.containment.impl.ContainsExtensionImpl <em>Contains Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.containment.impl.ContainsExtensionImpl
		 * @see ac.soton.eventb.emf.containment.impl.ContainmentPackageImpl#getContainsExtension()
		 * @generated
		 */
		EClass CONTAINS_EXTENSION = eINSTANCE.getContainsExtension();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS_EXTENSION__EXTENSION = eINSTANCE.getContainsExtension_Extension();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINS_EXTENSION__NAMES = eINSTANCE.getContainsExtension_Names();

	}

} //ContainmentPackage
