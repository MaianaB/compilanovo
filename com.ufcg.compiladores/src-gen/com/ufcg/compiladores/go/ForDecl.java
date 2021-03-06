/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.ForDecl#getClause <em>Clause</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.ForDecl#getRange <em>Range</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.ForDecl#getComandos <em>Comandos</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getForDecl()
 * @model
 * @generated
 */
public interface ForDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference.
   * @see #setClause(ForClause)
   * @see com.ufcg.compiladores.go.GoPackage#getForDecl_Clause()
   * @model containment="true"
   * @generated
   */
  ForClause getClause();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ForDecl#getClause <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause</em>' containment reference.
   * @see #getClause()
   * @generated
   */
  void setClause(ForClause value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RangeDecl)
   * @see com.ufcg.compiladores.go.GoPackage#getForDecl_Range()
   * @model containment="true"
   * @generated
   */
  RangeDecl getRange();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ForDecl#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RangeDecl value);

  /**
   * Returns the value of the '<em><b>Comandos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comandos</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comandos</em>' containment reference.
   * @see #setComandos(GoDecl)
   * @see com.ufcg.compiladores.go.GoPackage#getForDecl_Comandos()
   * @model containment="true"
   * @generated
   */
  GoDecl getComandos();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ForDecl#getComandos <em>Comandos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comandos</em>' containment reference.
   * @see #getComandos()
   * @generated
   */
  void setComandos(GoDecl value);

} // ForDecl
