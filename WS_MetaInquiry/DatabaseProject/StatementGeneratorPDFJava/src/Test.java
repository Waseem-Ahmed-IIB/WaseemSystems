import org.json.JSONObject;

import com.systemsltd.ubl.statementgenerator.dto.AccountStatementDto;
import com.systemsltd.ubl.statementgenerator.pdfgenerator.CBSPDFGenerator;


public class Test {

	public static void main (String args[]) throws Exception {
		
		String statementResponse = "{\"accountStatementInquiryResponse\":{\"statementItemList\":[{\"crDr\":\"D\",\"seqNo\":\"616474517\",\"instNo\":\"\",\"transactionAmount\":\"3022\",\"particulars\":\"POS SALE - VISA\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-26876.55\"},{\"crDr\":\"D\",\"seqNo\":\"616555896\",\"instNo\":\"9634716\",\"transactionAmount\":\"19380\",\"particulars\":\"12345609634716                150410   ICS TRANSACTION\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-7496.55\"},{\"crDr\":\"C\",\"seqNo\":\"616557597\",\"instNo\":\"616557597\",\"transactionAmount\":\"58000\",\"particulars\":\"4882735\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-65496.55\"},{\"crDr\":\"C\",\"seqNo\":\"616648012\",\"instNo\":\"616648012\",\"transactionAmount\":\"10000\",\"particulars\":\"2703080\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-75496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"},{\"crDr\":\"D\",\"seqNo\":\"616695394\",\"instNo\":\"9634800\",\"transactionAmount\":\"74000\",\"particulars\":\"ICS FUNDS\",\"transactionDate\":\"10-APR-15\",\"runBal\":\"-1496.55\"}],\"accountDetail\":{\"cif\":\"20132127 \",\"asOf\":\"10-APR-15\",\"accountAddress\":\"A-756 BLOCK H                      NORTH NAZIMABAD                    KARACHI                            6640929-6628196\",\"accountTitle\":\"SHAHARYAR SAJID\",\"toDate\":\"10-APR-15\",\"accountCurrency\":\"PAKISTANI RUPEE\",\"branchName\":\"CLIFTON BRANCH KARACHI\",\"accountIdentifier\":{\"accountNumber\":\"094910132997\"},\"birthDate\":\"16-NOV-81\",\"cellNumber\":\"03218259352\",\"fromDate\":\"10-APR-15\",\"branchCode\":\"0949\",\"iban\":\"PK39UNIL0112094910132997 \",\"accountBalance\":\"-2144.31\",\"openingBalance\":\"-2144.31\",\"depositType\":\"SAVING\",\"productType\":\"UBL SAVINGS ACCOUNT\"}},\"serviceHeader\":{\"processingType\":\"SYNCHRONOUS\",\"channel\":\"NETBANKING\",\"authInfo\":{\"authKey\":\"12345454A54555455\",\"password\":\"abcd123\",\"authenticationType\":\"type1\",\"username\":\"CBSSOA\"}},\"transactionInfo\":{\"transactionType\":\"ACCOUNT_STATEMENT_INQUIRY\",\"transmissionDateTime\":\"2018-03-05T11:10:10\",\"attributeList\":[{\"attributeValue\":\"ACCOUNTSTATEMENT\",\"attributeKey\":\"appCode\"},{\"attributeValue\":\"MYPC\",\"attributeKey\":\"workstation\"},{\"attributeValue\":\"ACCTSTMT\",\"attributeKey\":\"screenNo\"}],\"stan\":\"000000\",\"transactionDate\":\"2018-03-05\",\"transactionTime\":\"00:00:00\",\"referenceId\":\"AcctStmt138\"}}";
		CBSPDFGenerator pdfGenerator = new CBSPDFGenerator();
		
		AccountStatementDto stmtDto = new AccountStatementDto();
		stmtDto.setStatementResponse(statementResponse);
		stmtDto.setResourcesPath("D:/IIBDevlepment/UBL/vm/");
		pdfGenerator.generatePDF(stmtDto);
		
	}
}
