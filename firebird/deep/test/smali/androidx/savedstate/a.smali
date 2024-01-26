.class public final Landroidx/savedstate/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/savedstate/a$b;,
        Landroidx/savedstate/a$a;
    }
.end annotation


# instance fields
.field public a:Lj/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/b<",
            "Ljava/lang/String;",
            "Landroidx/savedstate/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/os/Bundle;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj/b;

    invoke-direct {v0}, Lj/b;-><init>()V

    iput-object v0, p0, Landroidx/savedstate/a;->a:Lj/b;

    return-void
.end method
