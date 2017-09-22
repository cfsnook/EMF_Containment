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

import ac.soton.eventb.emf.containment.ContainmentPackage;
import ac.soton.eventb.emf.containment.ContainsExtension;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eventb.emf.core.AbstractExtension;

import org.eventb.emf.core.impl.AbstractExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contains Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.containment.impl.ContainsExtensionImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.containment.impl.ContainsExtensionImpl#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainsExtensionImpl extends AbstractExtensionImpl implements ContainsExtension {
	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected AbstractExtension extension;

	/**
	 * The cached value of the '{@link #getNames() <em>Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> names;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainsExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainmentPackage.Literals.CONTAINS_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExtension getExtension() {
		if (extension != null && extension.eIsProxy()) {
			InternalEObject oldExtension = (InternalEObject)extension;
			extension = (AbstractExtension)eResolveProxy(oldExtension);
			if (extension != oldExtension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainmentPackage.CONTAINS_EXTENSION__EXTENSION, oldExtension, extension));
			}
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExtension basicGetExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(AbstractExtension newExtension) {
		AbstractExtension oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainmentPackage.CONTAINS_EXTENSION__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNames() {
		if (names == null) {
			names = new EDataTypeUniqueEList<String>(String.class, this, ContainmentPackage.CONTAINS_EXTENSION__NAMES);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainmentPackage.CONTAINS_EXTENSION__EXTENSION:
				if (resolve) return getExtension();
				return basicGetExtension();
			case ContainmentPackage.CONTAINS_EXTENSION__NAMES:
				return getNames();
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
			case ContainmentPackage.CONTAINS_EXTENSION__EXTENSION:
				setExtension((AbstractExtension)newValue);
				return;
			case ContainmentPackage.CONTAINS_EXTENSION__NAMES:
				getNames().clear();
				getNames().addAll((Collection<? extends String>)newValue);
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
			case ContainmentPackage.CONTAINS_EXTENSION__EXTENSION:
				setExtension((AbstractExtension)null);
				return;
			case ContainmentPackage.CONTAINS_EXTENSION__NAMES:
				getNames().clear();
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
			case ContainmentPackage.CONTAINS_EXTENSION__EXTENSION:
				return extension != null;
			case ContainmentPackage.CONTAINS_EXTENSION__NAMES:
				return names != null && !names.isEmpty();
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
		result.append(" (names: ");
		result.append(names);
		result.append(')');
		return result.toString();
	}

} //ContainsExtensionImpl
