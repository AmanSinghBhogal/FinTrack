/**
 * @license
 * Copyright (c) 2014, 2025, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import { h } from "preact";
import { useRef, useState, useEffect } from "preact/hooks";
import * as ResponsiveUtils from "ojs/ojresponsiveutils";

type Props = Readonly<{
  duckWorld: string
}>;

export function Content({ duckWorld }: Props) {
  return (
    <div class="oj-web-applayout-content oj-web-applayout-max-width oj-web-applayout-content">
      <span>{duckWorld}</span>

      <div class="house">
        <div class="roof"></div>
        <div class="walls"></div>
        <div class="door"></div>
      </div>

    </div>

  );
};
