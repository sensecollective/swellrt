package org.swellrt.beta.model;


import org.swellrt.beta.common.SException;
import org.waveprotocol.wave.model.document.operation.DocInitialization;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsOptional;
import jsinterop.annotations.JsType;

@JsType(namespace = "swell", name = "Text")
public interface SText extends SNode {

  public static SText create(@JsOptional Object data) throws SException {
    String text = "";
    if (data != null && data instanceof String)
      text = (String) data;

    return ModelFactory.instance.createLocalText(text);
  }

  public String getRawContent();

  public boolean isEmpty();

  /**
   * A representation of the text data suitable to
   * inject in new documents.
   * @return
   */
  @JsIgnore
  public DocInitialization getInitContent();

  /**
   * Cosume raw operations
   *
   * @param ops
   */
  @JsIgnore
  public void setInitContent(DocInitialization ops);
}
