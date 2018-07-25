/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.FunctionCall;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.LITERAIS_BASICOS;
import com.ufcg.compiladores.go.ReturnStmt;
import com.ufcg.compiladores.go.VarCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.ReturnStmtImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.ReturnStmtImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.ReturnStmtImpl#getIdVar <em>Id Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnStmtImpl extends MinimalEObjectImpl.Container implements ReturnStmt
{
  /**
   * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasic()
   * @generated
   * @ordered
   */
  protected LITERAIS_BASICOS basic;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected FunctionCall func;

  /**
   * The cached value of the '{@link #getIdVar() <em>Id Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdVar()
   * @generated
   * @ordered
   */
  protected VarCall idVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnStmtImpl()
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
    return GoPackage.Literals.RETURN_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LITERAIS_BASICOS getBasic()
  {
    return basic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasic(LITERAIS_BASICOS newBasic, NotificationChain msgs)
  {
    LITERAIS_BASICOS oldBasic = basic;
    basic = newBasic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RETURN_STMT__BASIC, oldBasic, newBasic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasic(LITERAIS_BASICOS newBasic)
  {
    if (newBasic != basic)
    {
      NotificationChain msgs = null;
      if (basic != null)
        msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RETURN_STMT__BASIC, null, msgs);
      if (newBasic != null)
        msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RETURN_STMT__BASIC, null, msgs);
      msgs = basicSetBasic(newBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RETURN_STMT__BASIC, newBasic, newBasic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall getFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunc(FunctionCall newFunc, NotificationChain msgs)
  {
    FunctionCall oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RETURN_STMT__FUNC, oldFunc, newFunc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(FunctionCall newFunc)
  {
    if (newFunc != func)
    {
      NotificationChain msgs = null;
      if (func != null)
        msgs = ((InternalEObject)func).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RETURN_STMT__FUNC, null, msgs);
      if (newFunc != null)
        msgs = ((InternalEObject)newFunc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RETURN_STMT__FUNC, null, msgs);
      msgs = basicSetFunc(newFunc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RETURN_STMT__FUNC, newFunc, newFunc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarCall getIdVar()
  {
    return idVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdVar(VarCall newIdVar, NotificationChain msgs)
  {
    VarCall oldIdVar = idVar;
    idVar = newIdVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RETURN_STMT__ID_VAR, oldIdVar, newIdVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdVar(VarCall newIdVar)
  {
    if (newIdVar != idVar)
    {
      NotificationChain msgs = null;
      if (idVar != null)
        msgs = ((InternalEObject)idVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RETURN_STMT__ID_VAR, null, msgs);
      if (newIdVar != null)
        msgs = ((InternalEObject)newIdVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RETURN_STMT__ID_VAR, null, msgs);
      msgs = basicSetIdVar(newIdVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RETURN_STMT__ID_VAR, newIdVar, newIdVar));
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
      case GoPackage.RETURN_STMT__BASIC:
        return basicSetBasic(null, msgs);
      case GoPackage.RETURN_STMT__FUNC:
        return basicSetFunc(null, msgs);
      case GoPackage.RETURN_STMT__ID_VAR:
        return basicSetIdVar(null, msgs);
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
      case GoPackage.RETURN_STMT__BASIC:
        return getBasic();
      case GoPackage.RETURN_STMT__FUNC:
        return getFunc();
      case GoPackage.RETURN_STMT__ID_VAR:
        return getIdVar();
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
      case GoPackage.RETURN_STMT__BASIC:
        setBasic((LITERAIS_BASICOS)newValue);
        return;
      case GoPackage.RETURN_STMT__FUNC:
        setFunc((FunctionCall)newValue);
        return;
      case GoPackage.RETURN_STMT__ID_VAR:
        setIdVar((VarCall)newValue);
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
      case GoPackage.RETURN_STMT__BASIC:
        setBasic((LITERAIS_BASICOS)null);
        return;
      case GoPackage.RETURN_STMT__FUNC:
        setFunc((FunctionCall)null);
        return;
      case GoPackage.RETURN_STMT__ID_VAR:
        setIdVar((VarCall)null);
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
      case GoPackage.RETURN_STMT__BASIC:
        return basic != null;
      case GoPackage.RETURN_STMT__FUNC:
        return func != null;
      case GoPackage.RETURN_STMT__ID_VAR:
        return idVar != null;
    }
    return super.eIsSet(featureID);
  }

} //ReturnStmtImpl
