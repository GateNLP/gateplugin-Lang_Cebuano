/*
 *  CebuanoTokeniser.java
 *
 *  Copyright (c) 1995-2014, The University of Sheffield. See the file
 *  COPYRIGHT.txt in the software or at http://gate.ac.uk/gate/COPYRIGHT.txt
 *
 *  This file is part of GATE (see http://gate.ac.uk/), and is free
 *  software, licenced under the GNU Library General Public License,
 *  Version 2, June 1991 (in the distribution as file licence.html,
 *  and also available at http://gate.ac.uk/gate/licence.html).
 */

package cebuano;

import gate.creole.ResourceReference;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;
import gate.creole.tokeniser.DefaultTokeniser;

@CreoleResource(name="Cebuano Tokeniser")
public class CebuanoTokeniser extends DefaultTokeniser {

  private static final long serialVersionUID = -4016532776016432085L;

  @CreoleParameter(defaultValue="resources/tokeniser/DefaultTokeniser.rules")
	public void setTokeniserRulesURL(ResourceReference url) {
		super.setTokeniserRulesURL(url);
	}

	@CreoleParameter(defaultValue="resources/tokeniser/postprocess.jape")
	public void setTransducerGrammarURL(ResourceReference url) {
		super.setTransducerGrammarURL(url);
	}
}
