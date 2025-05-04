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
// @ts-ignore
require(['css!components/content/Content.css']);

type Props = Readonly<{
  name: string | null,
  age: number | null
}>;

export function Content({ name, age}: Props) {
  return (
    <div class="content">
      <div class="canvas oj-web-applayout-max-width">
        {name == null? "No Name Found": name}
      </div>
      <div class="canvas oj-web-applayout-max-width">
        {age == null? "No Age Found": age}
      </div>
      

    </div>

  );
};
