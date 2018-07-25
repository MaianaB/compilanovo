/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.RangeDecl#getIdList <em>Id List</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.RangeDecl#getIgual <em>Igual</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.RangeDecl#getOp <em>Op</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.RangeDecl#getVariavel <em>Variavel</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.RangeDecl#getFunc <em>Func</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getRangeDecl()
 * @model
 * @generated
 */
public interface RangeDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Id List</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.IDList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getRangeDecl_IdList()
   * @model containment="true"
   * @generated
   */
  EList<IDList> getIdList();

  /**
   * Returns the value of the '<em><b>Igual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Igual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Igual</em>' containment reference.
   * @see #setIgual(IGUAL)
   * @see com.ufcg.compiladores.go.GoPackage#getRangeDecl_Igual()
   * @model containment="true"
   * @generated
   */
  IGUAL getIgual();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.RangeDecl#getIgual <em>Igual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Igual</em>' containment reference.
   * @see #getIgual()
   * @generated
   */
  void setIgual(IGUAL value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(PONTOSIGUAL)
   * @see com.ufcg.compiladores.go.GoPackage#getRangeDecl_Op()
   * @model containment="true"
   * @generated
   */
  PONTOSIGUAL getOp();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.RangeDecl#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(PONTOSIGUAL value);

  /**
   * Returns the value of the '<em><b>Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variavel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variavel</em>' containment reference.
   * @see #setVariavel(VarCall)
   * @see com.ufcg.compiladores.go.GoPackage#getRangeDecl_Variavel()
   * @model containment="true"
   * @generated
   */
  VarCall getVariavel();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.RangeDecl#getVariavel <em>Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variavel</em>' containment reference.
   * @see #getVariavel()
   * @generated
   */
  void setVariavel(VarCall value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(FunctionCall)
   * @see com.ufcg.compiladores.go.GoPackage#getRangeDecl_Func()
   * @model containment="true"
   * @generated
   */
  FunctionCall getFunc();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.RangeDecl#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(FunctionCall value);

} // RangeDecl
