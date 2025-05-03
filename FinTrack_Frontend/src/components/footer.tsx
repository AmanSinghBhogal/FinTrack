/**
 * @license
 * Copyright (c) 2014, 2025, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import { h } from "preact";

type Props = {
  links?: FooterLink[]
}

type FooterLink = {
  name: string;
  linkId: string;
  linkTarget: string;
}

const _DEFAULT_LINKS: FooterLink[] = [
  {
    name: "Aman's Website",
    linkId: "aman",
    linkTarget: "https://amansinghbhogal.online/"
  },
  {
    name: "Mausmi's Github",
    linkId: "mausinha",
    linkTarget: "https://github.com/MausmiSinha"
  }
]

export function Footer({ links = _DEFAULT_LINKS } : Props ) {
  return (
    <footer class="oj-web-applayout-footer" role="contentinfo">
      <div class="oj-web-applayout-footer-content">
        <div class="oj-web-applayout-footer-item oj-web-applayout-max-width">
          <ul>
            {links.map((item) => (
              <li>
                <a id={item.linkId} href={item.linkTarget} >
                  {item.name}
                </a>
              </li>
            ))}
          </ul>
        </div>
        <div class="oj-web-applayout-footer-item oj-web-applayout-max-width oj-text-color-secondary oj-typography-body-sm">
          Copyright © 2025, Made by Aman & Mausmi. All rights reserved.
        </div>
      </div>
    </footer>
  );
}
