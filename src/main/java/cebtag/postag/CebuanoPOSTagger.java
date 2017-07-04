package cebtag.postag;

import gate.creole.POSTagger;
import gate.creole.ResourceReference;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name="Cebuano POS Tagger")
public class CebuanoPOSTagger extends POSTagger {

  private static final long serialVersionUID = 1771036651186511273L;

  @Override
  @CreoleParameter(comment="The URL to the lexicon file", defaultValue="resources/postag/lexicon")
  public void setLexiconURL(ResourceReference newLexiconURL) {
    super.setLexiconURL(newLexiconURL);
  }
  
  @Override
  @CreoleParameter(comment="The URL to the ruleset file", defaultValue="resources/postag/ruleset")
  public void setRulesURL(ResourceReference newRulesURL) {
    super.setRulesURL(newRulesURL);
  }
  
  @Override
  @CreoleParameter(defaultValue="#")
  public void setLexiconSeparator(String separator) {
    super.setLexiconSeparator(separator);
  }
}
