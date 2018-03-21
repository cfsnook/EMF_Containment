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
package ac.soton.eventb.emf.containment.impl;

import ac.soton.eventb.emf.containment.ContainmentFactory;
import ac.soton.eventb.emf.containment.ContainmentPackage;

import ac.soton.eventb.emf.containment.ContainsExtension;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainmentPackageImpl extends EPackageImpl implements ContainmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsExtensionEClass = null;
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ac.soton.eventb.emf.containment.ContainmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContainmentPackageImpl() {
		super(eNS_URI, ContainmentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ContainmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContainmentPackage init() {
		if (isInited) return (ContainmentPackage)EPackage.Registry.INSTANCE.getEPackage(ContainmentPackage.eNS_URI);

		// Obtain or create and register package
		ContainmentPackageImpl theContainmentPackage = (ContainmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContainmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContainmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theContainmentPackage.createPackageContents();

		// Initialize created meta-data
		theContainmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContainmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContainmentPackage.eNS_URI, theContainmentPackage);
		return theContainmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainsExtension() {
		return containsExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainsExtension_Extension() {
		return (EReference)containsExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainsExtension_Names() {
		return (EAttribute)containsExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentFactory getContainmentFactory() {
		return (ContainmentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containsExtensionEClass = createEClass(CONTAINS_EXTENSION);
		createEReference(containsExtensionEClass, CONTAINS_EXTENSION__EXTENSION);
		createEAttribute(containsExtensionEClass, CONTAINS_EXTENSION__NAMES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containsExtensionEClass.getESuperTypes().add(theCorePackage.getAbstractExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(containsExtensionEClass, ContainsExtension.class, "ContainsExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainsExtension_Extension(), theCorePackage.getAbstractExtension(), null, "extension", null, 0, 1, ContainsExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainsExtension_Names(), ecorePackage.getEString(), "names", "", 0, -1, ContainsExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eventb.emf.core.extendedMetaClasses
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.eventb.emf.core.extendedMetaClasses</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eventb.emf.core.extendedMetaClasses";		
		addAnnotation
		  (containsExtensionEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CorePackage.eNS_URI).appendFragment("//machine/Machine")
		   });
	}

} //ContainmentPackageImpl
