/* This file was generated by SableCC (http://www.sablecc.org/). */

package cminus.analysis;

import cminus.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAVarDeclaracao(AVarDeclaracao node);
    void caseAFunDeclaracao(AFunDeclaracao node);
    void caseAMainFunDeclaracao(AMainFunDeclaracao node);
    void caseAStringTipo(AStringTipo node);
    void caseAIntTipo(AIntTipo node);
    void caseAVoidTipo(AVoidTipo node);
    void caseADeclParamParametro(ADeclParamParametro node);
    void caseADeclParamVoidParametro(ADeclParamVoidParametro node);
    void caseAIfelseInstrucao(AIfelseInstrucao node);
    void caseAInstExprInstrucao(AInstExprInstrucao node);
    void caseAIfPendenteInstrucao(AIfPendenteInstrucao node);
    void caseAInstWhileInstrucao(AInstWhileInstrucao node);
    void caseAInstReturnInstrucao(AInstReturnInstrucao node);
    void caseAInstrucoesCompostas(AInstrucoesCompostas node);
    void caseAAtribuicaoExpr(AAtribuicaoExpr node);
    void caseAExprAritimeticaExpr(AExprAritimeticaExpr node);
    void caseAExprLogicaExpr(AExprLogicaExpr node);
    void caseAMenorExprLogica(AMenorExprLogica node);
    void caseAMenorigualExprLogica(AMenorigualExprLogica node);
    void caseAMaiorExprLogica(AMaiorExprLogica node);
    void caseAMaiorigualExprLogica(AMaiorigualExprLogica node);
    void caseAIgualExprLogica(AIgualExprLogica node);
    void caseADiferenteExprLogica(ADiferenteExprLogica node);
    void caseAAddExprAritimetica(AAddExprAritimetica node);
    void caseASubExprAritimetica(ASubExprAritimetica node);
    void caseAMultExprAritimetica(AMultExprAritimetica node);
    void caseADivExprAritimetica(ADivExprAritimetica node);
    void caseAVariavelExprAritimetica(AVariavelExprAritimetica node);
    void caseANumeroExprAritimetica(ANumeroExprAritimetica node);
    void caseAExprExprAritimetica(AExprExprAritimetica node);
    void caseAChamadaFunExprAritimetica(AChamadaFunExprAritimetica node);

    void caseTElse(TElse node);
    void caseTIf(TIf node);
    void caseTKwInt(TKwInt node);
    void caseTKwString(TKwString node);
    void caseTReturn(TReturn node);
    void caseTKwVoid(TKwVoid node);
    void caseTMain(TMain node);
    void caseTWhile(TWhile node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTLess(TLess node);
    void caseTLessorequal(TLessorequal node);
    void caseTGreater(TGreater node);
    void caseTGreaterorequal(TGreaterorequal node);
    void caseTEqual(TEqual node);
    void caseTDifferent(TDifferent node);
    void caseTAssignment(TAssignment node);
    void caseTSemi(TSemi node);
    void caseTColon(TColon node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBra(TLBra node);
    void caseTRBra(TRBra node);
    void caseTLCur(TLCur node);
    void caseTRCur(TRCur node);
    void caseTDQuotes(TDQuotes node);
    void caseTNum(TNum node);
    void caseTId(TId node);
    void caseTBlank(TBlank node);
    void caseTComment(TComment node);
    void caseTShortComment(TShortComment node);
    void caseTCommentEnd(TCommentEnd node);
    void caseTCommentBody(TCommentBody node);
    void caseTStar(TStar node);
    void caseTSlash(TSlash node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}