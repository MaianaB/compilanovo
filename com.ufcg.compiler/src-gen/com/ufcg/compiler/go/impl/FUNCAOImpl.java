/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiler.go.impl;

import com.ufcg.compiler.go.BLOCK;
import com.ufcg.compiler.go.FUNCAO;
import com.ufcg.compiler.go.GoPackage;
import com.ufcg.compiler.go.PARAMETERS_LIST;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FUNCAO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiler.go.impl.FUNCAOImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.FUNCAOImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.FUNCAOImpl#getABRE_PARENTESES <em>ABRE PARENTESES</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.FUNCAOImpl#getPARAMETERS_LIST <em>PARAMETERS LIST</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.FUNCAOImpl#getFECHA_PARENTESES <em>FECHA PARENTESES</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.FUNCAOImpl#getBloco <em>Bloco</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FUNCAOImpl extends MinimalEObjectImpl.Container implements FUNCAO
{
  /**
   * The default value of the '{@link #getFunc() <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected static final String FUNC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected String func = FUNC_EDEFAULT;

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
   * The default value of the '{@link #getABRE_PARENTESES() <em>ABRE PARENTESES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getABRE_PARENTESES()
   * @generated
   * @ordered
   */
  protected static final String ABRE_PARENTESES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getABRE_PARENTESES() <em>ABRE PARENTESES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getABRE_PARENTESES()
   * @generated
   * @ordered
   */
  protected String abrE_PARENTESES = ABRE_PARENTESES_EDEFAULT;

  /**
   * The cached value of the '{@link #getPARAMETERS_LIST() <em>PARAMETERS LIST</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPARAMETERS_LIST()
   * @generated
   * @ordered
   */
  protected PARAMETERS_LIST parameterS_LIST;

  /**
   * The default value of the '{@link #getFECHA_PARENTESES() <em>FECHA PARENTESES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFECHA_PARENTESES()
   * @generated
   * @ordered
   */
  protected static final String FECHA_PARENTESES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFECHA_PARENTESES() <em>FECHA PARENTESES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFECHA_PARENTESES()
   * @generated
   * @ordered
   */
  protected String fechA_PARENTESES = FECHA_PARENTESES_EDEFAULT;

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
  protected FUNCAOImpl()
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
    return GoPackage.Literals.FUNCAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(String newFunc)
  {
    String oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCAO__FUNC, oldFunc, func));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCAO__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getABRE_PARENTESES()
  {
    return abrE_PARENTESES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setABRE_PARENTESES(String newABRE_PARENTESES)
  {
    String oldABRE_PARENTESES = abrE_PARENTESES;
    abrE_PARENTESES = newABRE_PARENTESES;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCAO__ABRE_PARENTESES, oldABRE_PARENTESES, abrE_PARENTESES));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PARAMETERS_LIST getPARAMETERS_LIST()
  {
    return parameterS_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPARAMETERS_LIST(PARAMETERS_LIST newPARAMETERS_LIST, NotificationChain msgs)
  {
    PARAMETERS_LIST oldPARAMETERS_LIST = parameterS_LIST;
    parameterS_LIST = newPARAMETERS_LIST;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.FUNCAO__PARAMETERS_LIST, oldPARAMETERS_LIST, newPARAMETERS_LIST);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPARAMETERS_LIST(PARAMETERS_LIST newPARAMETERS_LIST)
  {
    if (newPARAMETERS_LIST != parameterS_LIST)
    {
      NotificationChain msgs = null;
      if (parameterS_LIST != null)
        msgs = ((InternalEObject)parameterS_LIST).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.FUNCAO__PARAMETERS_LIST, null, msgs);
      if (newPARAMETERS_LIST != null)
        msgs = ((InternalEObject)newPARAMETERS_LIST).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.FUNCAO__PARAMETERS_LIST, null, msgs);
      msgs = basicSetPARAMETERS_LIST(newPARAMETERS_LIST, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCAO__PARAMETERS_LIST, newPARAMETERS_LIST, newPARAMETERS_LIST));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFECHA_PARENTESES()
  {
    return fechA_PARENTESES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFECHA_PARENTESES(String newFECHA_PARENTESES)
  {
    String oldFECHA_PARENTESES = fechA_PARENTESES;
    fechA_PARENTESES = newFECHA_PARENTESES;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCAO__FECHA_PARENTESES, oldFECHA_PARENTESES, fechA_PARENTESES));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.FUNCAO__BLOCO, oldBloco, newBloco);
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
        msgs = ((InternalEObject)bloco).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.FUNCAO__BLOCO, null, msgs);
      if (newBloco != null)
        msgs = ((InternalEObject)newBloco).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.FUNCAO__BLOCO, null, msgs);
      msgs = basicSetBloco(newBloco, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.FUNCAO__BLOCO, newBloco, newBloco));
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
      case GoPackage.FUNCAO__PARAMETERS_LIST:
        return basicSetPARAMETERS_LIST(null, msgs);
      case GoPackage.FUNCAO__BLOCO:
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
      case GoPackage.FUNCAO__FUNC:
        return getFunc();
      case GoPackage.FUNCAO__NOME:
        return getNome();
      case GoPackage.FUNCAO__ABRE_PARENTESES:
        return getABRE_PARENTESES();
      case GoPackage.FUNCAO__PARAMETERS_LIST:
        return getPARAMETERS_LIST();
      case GoPackage.FUNCAO__FECHA_PARENTESES:
        return getFECHA_PARENTESES();
      case GoPackage.FUNCAO__BLOCO:
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
      case GoPackage.FUNCAO__FUNC:
        setFunc((String)newValue);
        return;
      case GoPackage.FUNCAO__NOME:
        setNome((String)newValue);
        return;
      case GoPackage.FUNCAO__ABRE_PARENTESES:
        setABRE_PARENTESES((String)newValue);
        return;
      case GoPackage.FUNCAO__PARAMETERS_LIST:
        setPARAMETERS_LIST((PARAMETERS_LIST)newValue);
        return;
      case GoPackage.FUNCAO__FECHA_PARENTESES:
        setFECHA_PARENTESES((String)newValue);
        return;
      case GoPackage.FUNCAO__BLOCO:
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
      case GoPackage.FUNCAO__FUNC:
        setFunc(FUNC_EDEFAULT);
        return;
      case GoPackage.FUNCAO__NOME:
        setNome(NOME_EDEFAULT);
        return;
      case GoPackage.FUNCAO__ABRE_PARENTESES:
        setABRE_PARENTESES(ABRE_PARENTESES_EDEFAULT);
        return;
      case GoPackage.FUNCAO__PARAMETERS_LIST:
        setPARAMETERS_LIST((PARAMETERS_LIST)null);
        return;
      case GoPackage.FUNCAO__FECHA_PARENTESES:
        setFECHA_PARENTESES(FECHA_PARENTESES_EDEFAULT);
        return;
      case GoPackage.FUNCAO__BLOCO:
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
      case GoPackage.FUNCAO__FUNC:
        return FUNC_EDEFAULT == null ? func != null : !FUNC_EDEFAULT.equals(func);
      case GoPackage.FUNCAO__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
      case GoPackage.FUNCAO__ABRE_PARENTESES:
        return ABRE_PARENTESES_EDEFAULT == null ? abrE_PARENTESES != null : !ABRE_PARENTESES_EDEFAULT.equals(abrE_PARENTESES);
      case GoPackage.FUNCAO__PARAMETERS_LIST:
        return parameterS_LIST != null;
      case GoPackage.FUNCAO__FECHA_PARENTESES:
        return FECHA_PARENTESES_EDEFAULT == null ? fechA_PARENTESES != null : !FECHA_PARENTESES_EDEFAULT.equals(fechA_PARENTESES);
      case GoPackage.FUNCAO__BLOCO:
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
    result.append(" (func: ");
    result.append(func);
    result.append(", nome: ");
    result.append(nome);
    result.append(", ABRE_PARENTESES: ");
    result.append(abrE_PARENTESES);
    result.append(", FECHA_PARENTESES: ");
    result.append(fechA_PARENTESES);
    result.append(')');
    return result.toString();
  }

} //FUNCAOImpl
