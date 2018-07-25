/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.SignatureDel;
import com.ufcg.compiladores.go.TIPO;
import com.ufcg.compiladores.go.Types;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Del</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.SignatureDelImpl#getTipoDecl <em>Tipo Decl</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.SignatureDelImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.SignatureDelImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureDelImpl extends MinimalEObjectImpl.Container implements SignatureDel
{
  /**
   * The cached value of the '{@link #getTipoDecl() <em>Tipo Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoDecl()
   * @generated
   * @ordered
   */
  protected TIPO tipoDecl;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Types type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignatureDelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoPackage.Literals.SIGNATURE_DEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TIPO getTipoDecl()
  {
    return tipoDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipoDecl(TIPO newTipoDecl, NotificationChain msgs)
  {
    TIPO oldTipoDecl = tipoDecl;
    tipoDecl = newTipoDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SIGNATURE_DEL__TIPO_DECL, oldTipoDecl, newTipoDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoDecl(TIPO newTipoDecl)
  {
    if (newTipoDecl != tipoDecl)
    {
      NotificationChain msgs = null;
      if (tipoDecl != null)
        msgs = ((InternalEObject)tipoDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIGNATURE_DEL__TIPO_DECL, null, msgs);
      if (newTipoDecl != null)
        msgs = ((InternalEObject)newTipoDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIGNATURE_DEL__TIPO_DECL, null, msgs);
      msgs = basicSetTipoDecl(newTipoDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIGNATURE_DEL__TIPO_DECL, newTipoDecl, newTipoDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIGNATURE_DEL__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Types getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Types newType, NotificationChain msgs)
  {
    Types oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SIGNATURE_DEL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Types newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIGNATURE_DEL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SIGNATURE_DEL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIGNATURE_DEL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoPackage.SIGNATURE_DEL__TIPO_DECL:
        return basicSetTipoDecl(null, msgs);
      case GoPackage.SIGNATURE_DEL__TYPE:
        return basicSetType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoPackage.SIGNATURE_DEL__TIPO_DECL:
        return getTipoDecl();
      case GoPackage.SIGNATURE_DEL__ID:
        return getId();
      case GoPackage.SIGNATURE_DEL__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.SIGNATURE_DEL__TIPO_DECL:
        setTipoDecl((TIPO)newValue);
        return;
      case GoPackage.SIGNATURE_DEL__ID:
        setId((String)newValue);
        return;
      case GoPackage.SIGNATURE_DEL__TYPE:
        setType((Types)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.SIGNATURE_DEL__TIPO_DECL:
        setTipoDecl((TIPO)null);
        return;
      case GoPackage.SIGNATURE_DEL__ID:
        setId(ID_EDEFAULT);
        return;
      case GoPackage.SIGNATURE_DEL__TYPE:
        setType((Types)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.SIGNATURE_DEL__TIPO_DECL:
        return tipoDecl != null;
      case GoPackage.SIGNATURE_DEL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case GoPackage.SIGNATURE_DEL__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //SignatureDelImpl
