/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.BLOCK;
import com.ufcg.compiladores.go.FunctionType;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.Signature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.FunctionTypeImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.FunctionTypeImpl#getAssinatura <em>Assinatura</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.FunctionTypeImpl#getBloco <em>Bloco</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionTypeImpl extends MinimalEObjectImpl.Container implements FunctionType
{
  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected String nome = NOME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssinatura() <em>Assinatura</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssinatura()
   * @generated
   * @ordered
   */
  protected Signature assinatura;

  /**
   * The cached value of the '{@link #getBloco() <em>Bloco</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBloco()
   * @generated
   * @ordered
   */
  protected BLOCK bloco;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionTypeImpl()
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
    return GoPackage.Literals.FUNCTION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNome()
  {
    return nome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNome(String newNome)
  {
    String oldNome = nome;
    nome = newNome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCTION_TYPE__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature getAssinatura()
  {
    return assinatura;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssinatura(Signature newAssinatura, NotificationChain msgs)
  {
    Signature oldAssinatura = assinatura;
    assinatura = newAssinatura;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.FUNCTION_TYPE__ASSINATURA, oldAssinatura, newAssinatura);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssinatura(Signature newAssinatura)
  {
    if (newAssinatura != assinatura)
    {
      NotificationChain msgs = null;
      if (assinatura != null)
        msgs = ((InternalEObject)assinatura).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.FUNCTION_TYPE__ASSINATURA, null, msgs);
      if (newAssinatura != null)
        msgs = ((InternalEObject)newAssinatura).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.FUNCTION_TYPE__ASSINATURA, null, msgs);
      msgs = basicSetAssinatura(newAssinatura, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCTION_TYPE__ASSINATURA, newAssinatura, newAssinatura));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BLOCK getBloco()
  {
    return bloco;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBloco(BLOCK newBloco, NotificationChain msgs)
  {
    BLOCK oldBloco = bloco;
    bloco = newBloco;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.FUNCTION_TYPE__BLOCO, oldBloco, newBloco);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBloco(BLOCK newBloco)
  {
    if (newBloco != bloco)
    {
      NotificationChain msgs = null;
      if (bloco != null)
        msgs = ((InternalEObject)bloco).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.FUNCTION_TYPE__BLOCO, null, msgs);
      if (newBloco != null)
        msgs = ((InternalEObject)newBloco).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.FUNCTION_TYPE__BLOCO, null, msgs);
      msgs = basicSetBloco(newBloco, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCTION_TYPE__BLOCO, newBloco, newBloco));
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
      case GoPackage.FUNCTION_TYPE__ASSINATURA:
        return basicSetAssinatura(null, msgs);
      case GoPackage.FUNCTION_TYPE__BLOCO:
        return basicSetBloco(null, msgs);
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
      case GoPackage.FUNCTION_TYPE__NOME:
        return getNome();
      case GoPackage.FUNCTION_TYPE__ASSINATURA:
        return getAssinatura();
      case GoPackage.FUNCTION_TYPE__BLOCO:
        return getBloco();
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
      case GoPackage.FUNCTION_TYPE__NOME:
        setNome((String)newValue);
        return;
      case GoPackage.FUNCTION_TYPE__ASSINATURA:
        setAssinatura((Signature)newValue);
        return;
      case GoPackage.FUNCTION_TYPE__BLOCO:
        setBloco((BLOCK)newValue);
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
      case GoPackage.FUNCTION_TYPE__NOME:
        setNome(NOME_EDEFAULT);
        return;
      case GoPackage.FUNCTION_TYPE__ASSINATURA:
        setAssinatura((Signature)null);
        return;
      case GoPackage.FUNCTION_TYPE__BLOCO:
        setBloco((BLOCK)null);
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
      case GoPackage.FUNCTION_TYPE__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
      case GoPackage.FUNCTION_TYPE__ASSINATURA:
        return assinatura != null;
      case GoPackage.FUNCTION_TYPE__BLOCO:
        return bloco != null;
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
    result.append(" (nome: ");
    result.append(nome);
    result.append(')');
    return result.toString();
  }

} //FunctionTypeImpl
