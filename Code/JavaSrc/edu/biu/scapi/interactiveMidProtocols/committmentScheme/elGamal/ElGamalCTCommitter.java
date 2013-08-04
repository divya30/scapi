/**
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
* 
Copyright (c) 2012 - SCAPI (http://crypto.biu.ac.il/scapi)
* This file is part of the SCAPI project.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
* to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
* and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
* FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
* WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
* 
* We request that any publication and/or code referring to and/or based on SCAPI contain an appropriate citation to SCAPI, including a reference to
* http://crypto.biu.ac.il/SCAPI.
* 
* SCAPI uses Crypto++, Miracl, NTL and Bouncy Castle. Please see these projects for any further licensing issues.
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
* 
*/
package edu.biu.scapi.interactiveMidProtocols.committmentScheme.elGamal;

import edu.biu.scapi.comm.Channel;
import edu.biu.scapi.exceptions.CommitValueException;
import edu.biu.scapi.exceptions.InvalidDlogGroupException;
import edu.biu.scapi.exceptions.SecurityLevelException;
import edu.biu.scapi.interactiveMidProtocols.committmentScheme.CTCommitter;
import edu.biu.scapi.interactiveMidProtocols.committmentScheme.CommitValue;
import edu.biu.scapi.midLayer.asymmetricCrypto.encryption.ScElGamalOnGroupElement;
import edu.biu.scapi.primitives.dlog.DlogGroup;
import edu.biu.scapi.securityLevel.PerfectlyBindingCT;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author user
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ElGamalCTCommitter extends ElGamalCTCCore implements CTCommitter, PerfectlyBindingCT {
	
	/*
	public ElGamalCTCommitter(Channel channel) throws IllegalArgumentException, SecurityLevelException, InvalidDlogGroupException{
		super(channel);
	}
	*/
	public ElGamalCTCommitter(Channel channel, DlogGroup dlog) throws IllegalArgumentException, SecurityLevelException, InvalidDlogGroupException{
			//doConstruct(channel, dlog, new SecureRandom());
		super(channel, dlog, new ScElGamalOnGroupElement(dlog));
	}

	/* (non-Javadoc)
	 * @see edu.biu.scapi.interactiveMidProtocols.committmentScheme.CTCommitter#generateCommitValue(byte[])
	 */
	@Override
	public CommitValue generateCommitValue(byte[] x)throws CommitValueException {
		throw new CommitValueException("El Gamal committer cannot generate a CommitValue from a byte[], since there isn't always a suitable encoding");
	}	
}