/**
 * Copyright (C) 2009/2016 - Cristiano Lehrer (cristiano@ybadoo.com.br)
 *                  Ybadoo - Solucoes em Software Livre (www.ybadoo.com.br)
 *
 * Permission is granted to copy, distribute and/or modify this document
 * under the terms of the GNU Free Documentation License, Version 1.3
 * or any later version published by the Free Software Foundation; with
 * no Invariant Sections, no Front-Cover Texts, and no Back-Cover Texts.
 * A copy of the license is included in the section entitled "GNU
 * Free Documentation License".
 */
/**
 * Client
 */
public class Application
{
  /**
   * Metodo principal da linguagem de programacao Java
   * 
   * @param args argumentos da linha de comando (nao utilizado)
   */
  public static void main(String[] args)
  {
    Inbox inbox = new Inbox();
    
    Desktop desktop = new Desktop();
    inbox.attach(desktop);
    
    Cellphone cellphone = new Cellphone();
    inbox.attach(cellphone);
    
    Watch watch = new Watch();
    inbox.attach(watch);
    
    /*
    Email email1 = new Email("fulano@xpto.com.br", "ciclano@xpto.com.br", "Encontro",
                             "Vamos nos reunir hoje?");
    */
    
    Email email1 = new Email("leo@ufpa.br", "bruno@ufpa.br", "Reuniao",
            "Vamos nos reunir hoje?");
    
    // Desktop: Encontro from fulano@xpto.com.br
    // Cellphone: Encontro from fulano@xpto.com.br
    // Watch: Encontro from fulano@xpto.com.br
    inbox.addEmail(email1);
    
    inbox.detach(cellphone);
    
    /*
    Email email2 = new Email("ciclano@xpto.com.br", "fulano@xpto.com.br", "Re:Encontro",
                             "Combinado!");
    */
    
    Email email2 = new Email("bruno@ufpa.br", "leo@ufpa.br", "Reuniao",
            "Vamos nos reunir hoje?");
    
    // Desktop: Re:Encontro from ciclano@xpto.com.br
    // Watch: Re:Encontro from ciclano@xpto.com.br
    inbox.addEmail(email2);
  }
}